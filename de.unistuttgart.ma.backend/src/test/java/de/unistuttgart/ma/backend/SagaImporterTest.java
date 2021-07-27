package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.importer.SagaImporterService;
import de.unistuttgart.ma.backend.repository.NotificationRepository;
import de.unistuttgart.ma.backend.repository.NotificationRepositoryProxy;
import de.unistuttgart.ma.backend.repository.SystemRepository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.backend.repository.TestContext;

@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
class SagaImporterTest {

	NotificationRetrievalService retrievalService;
	SagaImporterService importer;
	Controller controller;
	
	SystemRepositoryProxy repoProxy;
	@Autowired SystemRepository repository;
	
	NotificationRepositoryProxy notificationRepoProxy;
	@Autowired NotificationRepository notificationRepo;
	
	ResourceSet set;

	@BeforeEach
	public void setUp() {
		set = new ResourceSetImpl();
		
		repoProxy = new SystemRepositoryProxy(repository);
		notificationRepoProxy = new NotificationRepositoryProxy(notificationRepo, set);
		
		importer = new SagaImporterService(repoProxy, set);
		retrievalService = new NotificationRetrievalService(notificationRepo);
	}

	@Test
	void parseEmptySystemTest() throws IOException {
		String xml = Files.readString(Paths.get("src/test/resources/", "empty.saga"), StandardCharsets.UTF_8);					
		String filename = "filename.saga";
		
		importer.parse(xml, filename);
		
		de.unistuttgart.ma.saga.System actual = repoProxy.findById("60fa9cadc736ff6357a89a9b");
		
		assertNotNull(actual);
		assertNotNull(actual.getArchitecture());
		
		assertEquals(filename, actual.eResource().getURI().segment(actual.eResource().getURI().segmentCount() -1));
	}
	
	// TODO : not so empty systems :)
	
	@Test
	void parseT2BaseSystemTest() throws IOException {
		String xml = Files.readString(Paths.get("src/test/resources/", "t2_base.saga"), StandardCharsets.UTF_8);					
		String filename = "filename.saga";
		
		importer.parse(xml, filename);
		
		de.unistuttgart.ma.saga.System actual = repoProxy.findById("60fa9cadc736ff6357a89a9b");
		
		assertNotNull(actual);
		assertNotNull(actual.getArchitecture());
		
		assertEquals(filename, actual.eResource().getURI().segment(actual.eResource().getURI().segmentCount() -1));
		
		// TODO : assert the system :x
	}
	
	
	@Test
	void notificationSerializeTest() throws IOException, MissingSystemModelException {
		controller = new Controller(retrievalService, importer);
		String s = controller.getNotification("todo");
		System.err.println(s);
	}
	

}
