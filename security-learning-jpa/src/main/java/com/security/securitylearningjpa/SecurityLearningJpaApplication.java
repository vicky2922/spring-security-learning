package com.security.securitylearningjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.security.securitylearningjpa.repos.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityLearningJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityLearningJpaApplication.class, args);
	}

}
