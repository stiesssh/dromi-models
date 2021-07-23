package de.unistuttgart.ma.backend;

import org.springframework.beans.factory.annotation.Autowired;

import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * calculates impact after receiving and alert
 * 
 * @author maumau
 *
 */
public class NotificationCreationService {
	
	private final NotificationRespository repository;
	
	public NotificationCreationService(@Autowired NotificationRespository repository) {
		this.repository = repository;
	}

	
	public void calculateImpacts(Alert alert) {
		
		// get system from repository --> throw missing system
		
		// get notification(s) (not yet reported) from repository 
		
		// FINALLY : save the calculated impacts to the db.
		// --> get system by gropius id. or go by gropius id only?? 
	
	
	}
}

