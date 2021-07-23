package de.unistuttgart.ma.backend.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.impact.Notification;


/**
 * 
 * TODO this with a real repository.
 * most likely a JPA, because i also write, and it might happen concuttently. 
 * 
 * @author maumau
 *
 */
public class NotificationRespository {
	List<Notification> notifications;
	List<System> systems;
	
	public NotificationRespository() {
		this.systems = new ArrayList<>();
		this.notifications = new ArrayList<>();
	}
	
	public System save(System project) {
		systems.add(project);
		return project;
	}
	
	public System findById(String id) {
		for (System s : systems) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		throw new NoSuchElementException("missing system for id" + id);
	}
}	
