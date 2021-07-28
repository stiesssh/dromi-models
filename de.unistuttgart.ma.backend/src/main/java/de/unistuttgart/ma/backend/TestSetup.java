package de.unistuttgart.ma.backend;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.SloRule;
import de.unistuttgart.gropius.slo.Violation;
import de.unistuttgart.ma.backend.repository.ImpactRepositoryProxy;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;

@Component
@Profile("test")
public class TestSetup {

	@Autowired
	SystemRepositoryProxy systemRepoProxy;
	@Autowired
	ImpactRepositoryProxy impactRepoProxy;

	@PostConstruct
	public void init() throws IOException {

		systemRepoProxy.testInit();

		String systemId = "60fa9cadc736ff6357a89a9b";
		de.unistuttgart.ma.saga.System system = systemRepoProxy.findById(systemId);

		ComponentInterface creditInstituteFace = system.getComponentInterfaceById("5e8cf780c585a029");
		ComponentInterface paymentFace = system.getComponentInterfaceById("5e8cf760d345a028");
		SloRule rule = system.getSloForNode(creditInstituteFace).iterator().next();

		{
			Violation violation = SloFactory.eINSTANCE.createViolation();
			violation.setSloRule(rule);

			Impact impact = ImpactFactory.eINSTANCE.createImpact();
			impact.setLocation(paymentFace);
			impact.setRootCause(violation);

			impactRepoProxy.save(impact, systemId);
		}
		{
			Violation violation = SloFactory.eINSTANCE.createViolation();
			violation.setSloRule(rule);

			Impact impact = ImpactFactory.eINSTANCE.createImpact();
			impact.setLocation(paymentFace);
			impact.setRootCause(violation);

			impactRepoProxy.save(impact, systemId);
		}
	}
}
