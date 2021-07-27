package de.unistuttgart.ma.backend.repository;

import org.springframework.data.annotation.Id;

public class NotificationItem {
	@Id
	String id;
	String systemId;
	String content;
}
