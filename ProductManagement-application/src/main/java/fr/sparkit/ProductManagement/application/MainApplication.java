package fr.sparkit.ProductManagement.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication()
@EntityScan("fr.sparkit.ProductManagement.entities")
@ComponentScan("fr.sparkit.ProductManagement")
@EnableJpaRepositories("fr.sparkit.ProductManagement")
@EnableCaching
@Slf4j
public class MainApplication extends SpringBootServletInitializer{

    public MainApplication() {
        super();
    }



    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }



}
