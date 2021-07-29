package de.unistuttgart.ma.backend;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.backend.exceptions.MissingSystemModelException;
import de.unistuttgart.ma.backend.repository.ImpactRepositoryProxy;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
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
	
	private final ResourceSet set;

	public NotificationRetrievalService(@Autowired ImpactRepositoryProxy repository, @Autowired SystemRepositoryProxy systemRepo, @Autowired ResourceSet set) {
		this.repository = repository;
		this.systemRepo = systemRepo;
		this.set = set;
	}
	
	public String retrieveNotification(String systemId) throws MissingSystemModelException, IOException {

		Set<Impact> impacts = repository.findBySystemId(systemId);
		
		Notification note = makeContainerNotification(impacts);
		
		Resource res = set.createResource(URI.createPlatformPluginURI("foo.impact", false));
		
		res.getContents().add(note);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		res.save(outputStream, null);
		
		return outputStream.toString();
	}
	
	private Notification makeContainerNotification(Set<Impact> impacts) {
		Notification note = ImpactFactory.eINSTANCE.createNotification();
		note.getTopLevelImpacts().addAll(impacts);
		
		for (Impact impact : impacts) {
			Impact current = impact;
			while (current != null) {
				note.getImpacts().add(current);
				current = current.getCause();
			}	
		}
		return note;
	}
}
