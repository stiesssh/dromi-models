package de.unistuttgart.ma.backend.repository;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.saga.System;

/**
 * 
 * @author maumau
 *
 */
@Component
public class SystemRepositoryProxy {
	
	private final SystemRepository repository;
	
	public SystemRepositoryProxy(@Autowired SystemRepository repository) {
		this.repository = repository;
		this.loadedSystems = new HashMap<>();
		this.projectId2SystemId = new HashMap<>();
		this.SystemId2ResourceUri = new HashMap<>();
	}
	
	private final HashMap<String, de.unistuttgart.ma.saga.System> loadedSystems;
	
	// TODO : 1 : n mapping
	private final HashMap<String, String> projectId2SystemId;
	
	private final HashMap<String, String> SystemId2ResourceUri;
	
	public void save(de.unistuttgart.ma.saga.System system) {
		// serialize system with any(?) ressource.
		
		// save xml to repository.
		
		loadedSystems.put(system.getId(), system);
		projectId2SystemId.put(system.getArchitecture().getId(), system.getId());
	}
	
	public System findByArchitectureId(String Id) {
		String systemId = projectId2SystemId.get(Id);
		
		return findById(systemId);	
	}
	
	public System findById(String id) {
		if (loadedSystems.containsKey(id)) {
			return loadedSystems.get(id);
		}
		
		// TODO : load system from repository
		return null;	
	}
	
	public String getIdForFilename(String Filename) {
		SystemItem item = repository.save(new SystemItem());
		return item.id;
	}
}
