package de.unistuttgart.ma.backend.importer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.System;

/**
 * responsible for parsing input to a system instance and save that instance to the repository 
 * 
 * @author maumau
 *
 */
@Component
public class SagaImporterService  {
	
	private final SystemRepositoryProxy repository;
	private final ResourceSet set;

	public SagaImporterService(@Autowired SystemRepositoryProxy repository, @Autowired ResourceSet set) {
		this.repository = repository;
		this.set = set;
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saga", new EcoreResourceFactoryImpl());
		SagaPackage packageInstance = SagaPackage.eINSTANCE;		
	}

	public void parse(String xml, String filename) throws IOException {
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
				
		// create with correct file name, such that references also work on front end. 
		Resource resource = set.getResource(URI.createPlatformResourceURI(filename, false), false);
		if (resource == null) {
			resource = set.createResource(URI.createPlatformResourceURI(filename, false));
		}
		resource.load(targetStream, null);

		System model = null;
		
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof System) {
				model = (System) eObject;
			}
		}
				
		repository.save(model);
	}
	
	public String getIdForSystemModel(String filename) {
		return repository.getIdForFilename(filename);
	}

}

