package de.unistuttgart.ma.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import de.unistuttgart.ma.backend.repository.NotificationRepositoryProxy;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.backend.repository.SystemRepository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;

@EnableMongoRepositories(basePackageClasses = {SystemRepository.class, NotificationRespository.class})
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
//	@Autowired NotificationRespository notificationRespo;
//	@Autowired SystemRepository systemRepo;
//	
//	@Bean
//	public NotificationRepositoryProxy notificationRepositoryProxy() {
//		return new NotificationRepositoryProxy(notificationRespo);
//	}
//	
//	@Bean
//	public SystemRepositoryProxy systemRepositoryProxy() {
//		return new SystemRepositoryProxy(systemRepo);
//	}
//	
//	@Bean
//	public NotificationCreationService notificationCreationService () {
//		return new NotificationCreationService();
//	}

}
