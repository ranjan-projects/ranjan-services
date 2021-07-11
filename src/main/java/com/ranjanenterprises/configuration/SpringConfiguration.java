package com.ranjanenterprises.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    /*@Bean(name = "databaseConfiguration")
    @ConditionalOnMissingBean(DatabaseConfiguration.class)
    public DatabaseConfiguration databaseConfiguration() {

        return new DatabaseConfiguration();
    }

    @Bean(name = "connectionStatus")
    public String connectionFactory(DatabaseConfiguration databaseConfiguration) {
        System.out.println("User is: " + databaseConfiguration.getUsername());
        System.out.println("Password is: " + databaseConfiguration.getPassword());

        return "success";
    }*/
}
