package de.unistuttgart.ma.backend;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;

import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.Task;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
	
	@Autowired ResourceSet set;

	public NotificationRetrievalService(@Autowired ImpactRepositoryProxy repository, @Autowired SystemRepositoryProxy systemRepo) {
		this.repository = repository;
		this.systemRepo = systemRepo;
	}

	public String retrieveImpactXMLs(String systemId) {
		//return repository.findXMLBySystemId(systemId);
		return repository.findXMLBySystemId(systemId).iterator().next();
	}
	
	public String retrieveNotification(String systemId) throws MissingSystemModelException, IOException {

		Set<Impact> impacts = repository.findBySystemId(systemId);
		
		Notification note = ImpactFactory.eINSTANCE.createNotification();
		note.getTopLevelImpacts().addAll(impacts);
		
		Resource res = set.createResource(URI.createPlatformPluginURI("foo.impact", false));
		
		res.getContents().add(note);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		res.save(outputStream, null);
		
		return outputStream.toString();
	}
}
