package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.importer.SagaImporterService;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.backend.repository.SystemRepository;
import de.unistuttgart.ma.backend.repository.TestContext;

@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
class SagaImporterTest {

	NotificationRetrievalService retrievalService;
	SagaImporterService importer;
	Controller controller;
	
	@Autowired SystemRepository repository;
	@Autowired NotificationRespository notficationRepository;

	@BeforeEach
	public void setUp() {
		importer = new SagaImporterService(repository);
		retrievalService = new NotificationRetrievalService(notficationRepository);
	}

	@Test
	void parseTest() {
		
		try {
			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
			+ "<saga:Model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL-XMI\" xmlns:saga=\"http://www.example.org/saga\" id=\"testProject\"/>";
			importer.parse(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void notificationSerializeTest() throws IOException, MissingSystemModelException {
		controller = new Controller(retrievalService, importer);
		String s = controller.getNotification("todo");
		System.err.println(s);
	}
	

}
