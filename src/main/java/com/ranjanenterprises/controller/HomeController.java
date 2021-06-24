package com.ranjanenterprises.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {

    Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("")
    public String home() {
        return "Welcome to Ranjan Enterprises";
    }

}
