package de.unistuttgart.ma.backend.repository;

import org.springframework.data.annotation.Id;

public class SystemItem {
	@Id
	String id;
	String content;
}
