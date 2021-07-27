package de.unistuttgart.ma.backend.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
//@EnableAutoConfiguration(exclude = {...})
@EnableMongoRepositories(basePackageClasses = {SystemRepository.class, NotificationRepository.class})
@Profile("test")
public class TestContext {

}
