package de.unistuttgart.ma.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.Violation;
import de.unistuttgart.ma.backend.rest.Alert;

/**
 * 
 * This Controller is for the Solomon to post alerts to.  
 * 
 * @author maumau
 *
 */
@RestController
public class AlertController {
	
	private final NotificationCreationService service;

	public AlertController(@Autowired NotificationCreationService service) {
		this.service = service;
	}

	/**
	 * 
	 * @param xml
	 */
	@PostMapping("/api/alert")
	public void importSiriusSystem(@RequestBody Alert alert) {
		Violation v = SloFactory.eINSTANCE.createViolation();
		// TODO : parse Alert to Violation
		service.calculateImpacts(v);
	}


//	@ExceptionHandler(MissingSystemModelException.class)
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public ResponseEntity<String> missingSystemModelException(MissingSystemModelException exception) {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
//	}

}
