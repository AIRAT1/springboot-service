package de.service.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "de.service")
@EnableJpaRepositories(basePackages = "de.service.repositories")
@EntityScan(basePackages = "de.service.models")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
