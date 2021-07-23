package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.importer.SagaImporterService;


class SagaImporterTest {

	SagaImporterService importer;
	Controller controller;

	@BeforeEach
	public void setUp() {
	
	}

	@Test
	void parseTest() {
		importer = new SagaImporterService();
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
		controller = new Controller();
		String s = controller.getNotification();
		System.err.println(s);
	}
	
	@Test
	void playground() {
				
	}
}
