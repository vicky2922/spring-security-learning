package com.security.securitylearningjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.security.securitylearningjwt.repos.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityLearningJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityLearningJwtApplication.class, args);
	}

}
