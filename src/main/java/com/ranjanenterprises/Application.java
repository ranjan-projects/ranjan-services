package com.ranjanenterprises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@SpringBootApplication
@EnableSwagger2
@CrossOrigin(origins = "http://localhost:3000")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
