package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import de.unistuttgart.ma.backend.importer.SagaImporterService;
import de.unistuttgart.ma.backend.repository.ImpactRepository;
import de.unistuttgart.ma.backend.repository.ImpactRepositoryProxy;
import de.unistuttgart.ma.backend.repository.SystemRepository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;

public abstract class FooTest {
	
	NotificationCreationService computationSerrvice;
	NotificationRetrievalService retrievalService;
	SagaImporterService importService;
	Controller controller;
	
	SystemRepositoryProxy systemRepoProxy;
	@Autowired SystemRepository systemRepo;
	
	ImpactRepositoryProxy notificationRepoProxy;
	@Autowired ImpactRepository notificationRepo;
	

	de.unistuttgart.ma.saga.System system; 
	String systemId = "60fa9cadc736ff6357a89a9b";
	
	ResourceSet set;

	@BeforeEach
	public void setUp() {
		set = new ResourceSetImpl();
		
		systemRepoProxy = new SystemRepositoryProxy(systemRepo, set);
		notificationRepoProxy = new ImpactRepositoryProxy(notificationRepo, set);
		
		importService = new SagaImporterService(systemRepoProxy, set);
		retrievalService = new NotificationRetrievalService(notificationRepoProxy, systemRepoProxy);
		computationSerrvice = new NotificationCreationService(notificationRepoProxy, systemRepoProxy);
		
		systemRepo.deleteAll();
		notificationRepo.deleteAll();
	}
	
	
	/**
	 * load the t2 store
	 * 
	 * @throws IOException
	 */
	public void loadSystem() throws IOException  {
		String xml = Files.readString(Paths.get("src/test/resources/", "t2_base.saga"), StandardCharsets.UTF_8);					
		String filename = "filename.saga";
		importService.parse(xml, filename);
		
		system = systemRepoProxy.findById(systemId);
				
		assertEquals(1, systemRepo.count());
	}

}
