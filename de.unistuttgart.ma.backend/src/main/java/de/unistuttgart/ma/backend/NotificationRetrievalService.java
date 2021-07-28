package de.unistuttgart.ma.backend;

import java.util.Set;
import java.util.UUID;

import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.SloRule;
import de.unistuttgart.gropius.slo.Violation;
import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.repository.ImpactRepository;
import de.unistuttgart.ma.backend.repository.ImpactRepositoryProxy;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.SagaStep;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * responsible for retrieving Notifications.
 * 
 * @author maumau
 *
 */
@Component
public class NotificationRetrievalService {

	private final ImpactRepositoryProxy repository;

	
	private final SystemRepositoryProxy systemRepo;

	public NotificationRetrievalService(@Autowired ImpactRepositoryProxy repository, @Autowired SystemRepositoryProxy systemRepo) {
		this.repository = repository;
		this.systemRepo = systemRepo;
	}

	public Set<String> retrieveImpactXMLs(String systemId) {
		return repository.findXMLBySystemId(systemId);
		
	}
	
	public Notification retrieveNotification(String systemId) throws MissingSystemModelException {

		// get system from repository --> throw missing system

		// get notification(s) (not yet reported) from repository

		return makeTestNotification(systemId);
	}

	public Notification makeTestNotification(String systemId) throws MissingSystemModelException {

		Notification notification = ImpactFactory.eINSTANCE.createNotification();

		de.unistuttgart.ma.saga.System s = systemRepo.findById(systemId);

		ComponentInterface creditInstituteFace = s.getComponentInterfaceById("5e8cf780c585a029");
		ComponentInterface paymentFace = s.getComponentInterfaceById("5e8cf760d345a028");
		SagaStep sagastep = s.getSagaStepById("paymentStep");
		FlowElement task = s.getTaskById("Task_4");
		SloRule rule = s.getSloForNode(creditInstituteFace).iterator().next();

		Violation violation = SloFactory.eINSTANCE.createViolation();
		violation.setSloRule(rule);

		Impact impact = ImpactFactory.eINSTANCE.createImpact();
		impact.setLocation(paymentFace);
		impact.setRootCause(violation);
		
		Impact impact1 = ImpactFactory.eINSTANCE.createImpact();
		impact1.setCause(impact);
		impact1.setLocation(sagastep);
		impact1.setCause(impact);
		
		Impact impact2 = ImpactFactory.eINSTANCE.createImpact();
		impact2.setCause(impact1);
		impact2.setLocation(task);
		impact2.setCause(impact1);

		notification.getTopLevelImpacts().add(impact2);

		return notification;
	}
}
