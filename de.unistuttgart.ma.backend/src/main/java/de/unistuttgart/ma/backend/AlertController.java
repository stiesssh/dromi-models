package de.unistuttgart.ma.backend;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.importer.SagaImporterService;
import de.unistuttgart.ma.saga.impact.Notification;

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
		service.calculateImpacts(alert);
	}


//	@ExceptionHandler(MissingSystemModelException.class)
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public ResponseEntity<String> missingSystemModelException(MissingSystemModelException exception) {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
//	}

}
