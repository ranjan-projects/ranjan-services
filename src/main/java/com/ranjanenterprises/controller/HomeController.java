package com.ranjanenterprises.controller;

import com.ranjanenterprises.entity.UserEntity;
import com.ranjanenterprises.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {

    Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("")
    public String home() {
        Iterable<UserEntity> entities = userRepository.findAll();
        entities.forEach(x -> LOGGER.info("User name: {}, id: {}", x.getName(), x.getUserId()));

        return "Welcome to Ranjan Enterprises";
    }

}
