package es.ebarrab.ejemplos.ejemplo20issuetracker.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "es.ebarrab.ejemplos.ejemplo20issuetracker.web",
                "es.ebarrab.ejemplos.ejemplo20issuetracker.common",
                "es.ebarrab.ejemplos.ejemplo20issuetracker.security"
        })
@EntityScan(basePackages = {"es.ebarrab.ejemplos.ejemplo20issuetracker.common"})
@EnableJpaRepositories(basePackages = {"es.ebarrab.ejemplos.ejemplo20issuetracker.common"})
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }

}
