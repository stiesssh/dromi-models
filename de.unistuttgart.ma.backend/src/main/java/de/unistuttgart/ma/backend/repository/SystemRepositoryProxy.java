package de.unistuttgart.ma.backend.repository;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.saga.System;

/**
 * 
 * @author maumau
 *
 */
@Component
public class SystemRepositoryProxy {
	
	private final SystemRepository repository;
	private final ResourceSet set;
	
	public SystemRepositoryProxy(@Autowired SystemRepository repository, @Autowired ResourceSet set) {
		this.repository = repository;
		this.set = set;
		
		this.loadedSystems = new HashMap<>();
		this.projectId2SystemId = new HashMap<>();
		this.SystemId2ResourceUri = new HashMap<>();
		
		// load maps from data base. 
	}
	
	// systemItemid -> system
	private final Map<String, de.unistuttgart.ma.saga.System> loadedSystems;
	
	// TODO : 1 : n mapping
	private final Map<String, String> projectId2SystemId;
	
	// systemID -> FileName
	private final Map<String, String> SystemId2ResourceUri;
	
	/**
	 * 
	 * @param system
	 */
	public void save(de.unistuttgart.ma.saga.System system) {
		if (!repository.existsById(system.getId())) {
			// throw new IllegalArgumentException("system no know. cant save unregistered system");
			String filename = system.eResource().getURI().segment(system.eResource().getURI().segmentCount() - 1);
			SystemItem item = new SystemItem(system.getId(), null, filename);
			repository.save(item);
			
			SystemId2ResourceUri.put(item.getId(), item.getFilename());
		}
		SystemItem item = repository.findById(system.getId()).get();
		
		try {
			repository.save(new SystemItem(item.getId(), serializeSystem(system), item.getFilename()));
			
			projectId2SystemId.put(system.getArchitecture().getId(), system.getId());
		} catch (IOException e) {
			// TODO throw i.e. 'could not save model' 
			e.printStackTrace();
			return;
		}
	}
	
	/**
	 * 
	 * @param projectId
	 * @return
	 */
	public System findByArchitectureId(String projectId) {
		return findById(projectId2SystemId.get(projectId));
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public System findById(String id) {
		if (loadedSystems.containsKey(id)) {
			return loadedSystems.get(id);
		}
		if (repository.existsById(id)) {
			SystemItem item = repository.findById(id).get();
			try {
				System system = deserializeSystem(item.getContent(), item.getFilename());
				loadedSystems.put(item.getId(), system);
				return system;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new NoSuchElementException(String.format("Missing System for id %s", id));	
	}
	
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public String getIdForFilename(String filename) {
		SystemItem item = new SystemItem(null, null, filename);
		return repository.save(item).getId();
	}
	
	/**
	 * Serialise system to ecore xml. 
	 * 
	 * @param system 
	 * @return ecore xml representation of impact.
	 * @throws IOException
	 */
	protected String serializeSystem(System system) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saga", new EcoreResourceFactoryImpl());
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		Resource res = system.eResource();
		res.save(outputStream, null);
		
		return outputStream.toString(StandardCharsets.UTF_8);
	}
	
	/**
	 * Deserialise system from ecore xml. 
	 * 
	 * @param impact 
	 * @return ecore xml representation of impact.
	 * @throws IOException
	 */
	protected System deserializeSystem(String xml, String filename) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saga", new EcoreResourceFactoryImpl());
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
				
		Resource resource = set.getResource(URI.createPlatformResourceURI(filename, false), false);
		if (resource == null) {
			resource = set.createResource(URI.createPlatformResourceURI(filename, false));
		}
		resource.load(targetStream, null);
		
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof System) {
				return (System) eObject;
			}
		}
		throw new IOException("Could not deserialize " + xml);
	}
}
