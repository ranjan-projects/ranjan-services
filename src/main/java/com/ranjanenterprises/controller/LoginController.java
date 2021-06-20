package com.ranjanenterprises.controller;

import com.ranjanenterprises.representation.login.LoginRequest;
import com.ranjanenterprises.representation.login.LoginResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("/authenticate")
    public ResponseEntity<LoginResponse> authenticateUser(@RequestBody LoginRequest loginRequest) {
        LOGGER.info("Authenticating the user with userId: {}, and password: {}", loginRequest.getUserId(), loginRequest.getPassword());

        LoginResponse response = LoginResponse.LoginResponseBuilder.aLoginResponse()
                        .withStatus("success")
                        .build();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
