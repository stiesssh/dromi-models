package de.unistuttgart.ma.backend;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * responsible for retrieving Notifications.
 * @author maumau
 *
 */
public class NotificationRetrievalService {
	
	private final NotificationRespository repository;
	
	
	public NotificationRetrievalService(@Autowired NotificationRespository repository) {
		this.repository = repository;
	}

	
	public Notification retrieveNotification(String systemID) throws MissingSystemModelException {
		
		// get system from repository --> throw missing system
		
		// get notification(s) (not yet reported) from repository 
		
		return makeTestNotification();
	}
	
	
	private Notification makeTestNotification() throws MissingSystemModelException {

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

//		if (m != null) {
//			// throw new MissingSystemModelException("system model is not set, can not
//			// compute impact");
//			alert.setSloRule(m.getSloRules().get(0));
//			impact.setLocation(alert.getSloRule().getGropiusComponentInterface().getConsumedBy().get(0));
//		}
		return notification;
	}
}

