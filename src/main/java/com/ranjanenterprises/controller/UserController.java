package com.ranjanenterprises.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/services/status")
    public String statusController() {
        return "success";
    }
}
