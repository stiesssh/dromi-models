package de.unistuttgart.ma.backend.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import de.unistuttgart.gropius.GropiusFactory;
import de.unistuttgart.gropius.Project;
import de.unistuttgart.ma.saga.SagaFactory;
import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * Apparently,  the MongoMapper can not handle the complex sturcture of Notifcation and System 
 * java.lang.StackOverflowError
 *	at org.springframework.util.ConcurrentReferenceHashMap.getReference(ConcurrentReferenceHashMap.java:264)
 *	[...]
 * making thing transient would most likely fix this, but i dont want to add additional annotattions to the generated files. 
 *
 * @author maumau
 *
 */
@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
public class RepositoryTest {
	
//	@Test
//	public void systemRepo_test(@Autowired SystemRepository repository) {
//		System s = SagaFactory.eINSTANCE.createSystem();
//		s.setId("foo");
//		
//		repository.save(s);
//		Optional<System> s2 = repository.findById("foo");
//		assertTrue(s2.isPresent());
//	}
//	
//	@Test
//	public void systemRepo_findByArchiectureId_test(@Autowired NotificationRespository repository) {
//		String projectId = "projectId";
//		
//		Notification n = ImpactFactory.eINSTANCE.createNotification();
//		n.setId(projectId);
//		Impact i = ImpactFactory.eINSTANCE.createImpact();
//		n.getImpacts().add(i);
//		
//		repository.save(n);
//		//List<System> s2 = repository.findByArchitectureId(projectId);
//		//assertFalse(s2.isEmpty());
//	}
//	
//	@Test
//	public void notificationRepo_test(@Autowired NotificationRespository repository) {
//		Notification n = ImpactFactory.eINSTANCE.createNotification();
//		n.setId("foo");
//		
//		repository.save(n);
//		Optional<Notification> s2 = repository.findById("foo");
//		assertTrue(s2.isPresent());
//	}
}
