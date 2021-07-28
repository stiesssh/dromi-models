package de.unistuttgart.ma.backend;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;

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

import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.importer.SagaImporterService;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * This controller provides the endpoints to be called by the sirius front end.
 *  
 * @author maumau
 *
 */
@RestController
public class Controller {

	
	private final NotificationRetrievalService service;
	private final SagaImporterService importService;

	public Controller(@Autowired NotificationRetrievalService service, @Autowired SagaImporterService importService) {
		this.service = service;
		this.importService = importService;
	}

	/**
	 * Endpoint to save a model, given as XML.
	 * @param xml
	 */
	@PostMapping("/api/model/{filename}")
	public void importSiriusSystem(@RequestBody String xml, @PathVariable String filename) {
		try {
			importService.parse(xml, filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Endpoint to save a model, given as XML.
	 * @param xml
	 */
	@GetMapping("/api/model/{filename}")
	public String getSystemModelId(@PathVariable String filename) {
		return importService.getIdForSystemModel(filename);
	}

	/**
	 * 
	 * Endpoint to get a notification in xml representation.
	 * 
	 * TODO : filter options??
	 *
	 * @return
	 * @throws IOException
	 * @throws MissingSystemModelException
	 */
	@GetMapping("/api/notification/{systemId}")
	public Set<String> getNotification(@PathVariable String systemId) throws IOException, MissingSystemModelException {
		return service.retrieveImpactXMLs(systemId);
	}
	

	@GetMapping("/")
	public String index() {
		return "Greetings :)";
	}

	@ExceptionHandler(MissingSystemModelException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> missingSystemModelException(MissingSystemModelException exception) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
	}

}
