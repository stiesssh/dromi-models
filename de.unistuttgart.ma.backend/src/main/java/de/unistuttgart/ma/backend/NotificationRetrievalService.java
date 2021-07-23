package de.unistuttgart.ma.backend;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * responsible for retrieving Notifications.
 * @author maumau
 *
 */
@Component
public class NotificationRetrievalService {
	
	private final NotificationRespository repository;
	
	@Autowired private SystemRepositoryProxy systemRepo;
	
	
	public NotificationRetrievalService(@Autowired NotificationRespository repository) {
		this.repository = repository;
	}

	
	public Notification retrieveNotification(String systemID) throws MissingSystemModelException {
		
		// get system from repository --> throw missing system
		
		// get notification(s) (not yet reported) from repository 
		
		return makeTestNotification(systemID);
	}
	
	
	private Notification makeTestNotification(String systemId) throws MissingSystemModelException {

		Notification notification = ImpactFactory.eINSTANCE.createNotification();
		notification.setId(UUID.randomUUID().toString());
		
		Alert alert = SloFactory.eINSTANCE.createAlert();
		alert.setName(UUID.randomUUID().toString());

		Impact impact = ImpactFactory.eINSTANCE.createImpact();
		impact.setRootCause(alert);
		impact.setId(UUID.randomUUID().toString());

		notification.getImpacts().add(impact);
		notification.setTopLevelImpacts(impact);
		notification.setAlert(alert);

		de.unistuttgart.ma.saga.System s = systemRepo.findById(systemId);
		
		alert.setSloRule(s.getSloRules().get(0));
		impact.setLocation(alert.getSloRule().getGropiusComponentInterface().getConsumedBy().get(0));

		return notification;
	}
}

