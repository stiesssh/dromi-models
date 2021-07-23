package de.unistuttgart.ma.backend.importer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.backend.repository.SystemRepository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.SagaPackage;

/**
 * responsible for parsing input to a system instance and save that instance to the repository 
 * 
 * @author maumau
 *
 */
@Component
public class SagaImporterService  {
	
	private final SystemRepositoryProxy repository;

	public SagaImporterService(@Autowired SystemRepositoryProxy repository) {
		this.repository = repository;
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saga", new EcoreResourceFactoryImpl());
		SagaPackage packageInstance = SagaPackage.eINSTANCE;		
	}

	public void parse(String xml, String filename) throws IOException {
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
		ResourceSet set = new ResourceSetImpl();
				
		Resource resource = set.createResource(URI.createPlatformResourceURI(filename, false));
		resource.load(targetStream, null);

		System model = null;
		
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof System) {
				model = (System) eObject;
			}
		}
		
		
		// filename includes file extension
		//model.eResource().setURI(URI.createPlatformResourceURI(model.getId(), false));
		
		repository.save(model);
	}
	
	public String getIdForSystemModel(String filename) {
		return repository.getIdForFilename(filename);
	}

}

