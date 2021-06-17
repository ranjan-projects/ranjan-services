package com.ranjanenterprises.controller;

import com.ranjanenterprises.representation.UserRequest;
import com.ranjanenterprises.representation.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/services/status")
    public ResponseEntity<String> statusController() {
        return new ResponseEntity<>("Service is up and running", HttpStatus.OK);
    }

    @GetMapping("/users/{userName}")
    public ResponseEntity<String> getUserDetailsController(@PathVariable("userName") String userName) {
        return new ResponseEntity<>("Welcome " + userName, HttpStatus.OK);
    }

    @PostMapping("/users/")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {

        UserResponse response = UserResponse.UserResponseBuilder.anUserResponse()
                        .withId(123)
                        .withMessage("User created successfully")
                        .withStatus("success")
                        .build();

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

}
