package de.unistuttgart.ma.backend.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.impact.Notification;

@Component
public class NotificationRepositoryProxy {
	
	private final NotificationRespository repository;
	
	public NotificationRepositoryProxy(@Autowired NotificationRespository repository) {
		this.repository = repository;
	}
	
	
	
	
	// TODO : delete
	HashMap<String, Notification> loadedNotifications;
	
	// TODO : 1 : n mapping
	HashMap<String, Set<String>> systemId2NotificationIds;
	
	public void save(Notification note, System system) {
		// serialize system with any(?) ressource.
		
		// save xml to repository.
		
		 
		
		loadedNotifications.put(note.getId(), note);
		Set<String> notifications;
		if (systemId2NotificationIds.containsKey(system.getId())) {
			notifications = systemId2NotificationIds.get(system.getId());
		} else {
			notifications = new HashSet<String>();
		}
		notifications.add(note.getId());
		systemId2NotificationIds.put(system.getId(), notifications);
	}
	
	public Set<Notification> findBySystemId(String Id) {
		Set<String> noteIds = systemId2NotificationIds.get(Id);
		
		Set<Notification> notifications = new HashSet();
		
		for (String noteId : noteIds) {
			findById(noteId);
		}
		
		return notifications;	
	}
	
	public Notification findById(String id) {
		if (loadedNotifications.containsKey(id)) {
			return loadedNotifications.get(id);
		}
		
		// TODO : load system from repository
		return null;	
	}
	

}
