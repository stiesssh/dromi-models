package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.SloRule;
import de.unistuttgart.ma.saga.impact.Impact;

@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
public class ImpactComputationTest extends FooTest{

	@Test
	void computeNotificationTest() throws IOException {
		loadSystem();
		
		ComponentInterface creditInstituteFace = system.getComponentInterfaceById("5e8cf780c585a029");
		SloRule rule = system.getSloForNode(creditInstituteFace).iterator().next();

		
		de.unistuttgart.gropius.slo.Violation violation = SloFactory.eINSTANCE.createViolation();
		violation.setSloRule(rule);
		
		computationSerrvice.calculateImpacts(violation);
		
		Set<Impact> actuals = notificationRepoProxy.findBySystemId(systemId);
		assertNotNull(actuals);
		assertEquals(2, actuals.size());
		
		Impact actual = actuals.iterator().next();
		assertNotNull(actual);
	}

}
