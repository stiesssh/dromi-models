package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.SloRule;
import de.unistuttgart.ma.backend.importer.SagaImporterService;
import de.unistuttgart.ma.backend.repository.NotificationRepository;
import de.unistuttgart.ma.backend.repository.NotificationRepositoryProxy;
import de.unistuttgart.ma.backend.repository.SystemRepository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
public class ImpactComputationTest {

	NotificationCreationService service;
	
	SagaImporterService importer;
	Controller controller;
	
	SystemRepositoryProxy systemRepoProxy;
	@Autowired SystemRepository systemRepo;
	
	NotificationRepositoryProxy notificationRepoProxy;
	@Autowired NotificationRepository notificationRepo;
	
	de.unistuttgart.ma.saga.System system; 
	
	
	private final String systemId = "60fa9cadc736ff6357a89a9b";

	@BeforeEach
	public void setUp() throws IOException {
		systemRepoProxy = new SystemRepositoryProxy(systemRepo);
		notificationRepoProxy = new NotificationRepositoryProxy(notificationRepo);
		
		importer = new SagaImporterService(systemRepoProxy);
		
		String xml = Files.readString(Paths.get("src/test/resources/", "t2_base.saga"), StandardCharsets.UTF_8);					
		String filename = "filename.saga";
		importer.parse(xml, filename);
		
		system = systemRepoProxy.findById(systemId);
		
		service = new NotificationCreationService(notificationRepo, systemRepoProxy);
	}

	@Test
	void computeNotificationTest() throws IOException {
		ComponentInterface creditInstituteFace = system.getComponentInterfaceById("5e8cf780c585a029");
		SloRule rule = system.getSloForNode(creditInstituteFace).iterator().next();

		
		de.unistuttgart.gropius.slo.Violation alert = SloFactory.eINSTANCE.createViolation();
		alert.setSloRule(rule);
		
		service.calculateImpacts(alert);
		
		Set<Notification> actuals = notificationRepoProxy.findBySystemId(systemId);
		assertNotNull(actuals);
		assertEquals(1, actuals.size());
		
		Notification actual = actuals.iterator().next();
		assertNotNull(actual);
		
		
		assertNotNull(actual.getTopLevelImpacts());
		assertEquals(2, actual.getTopLevelImpacts().size());
	}

}
