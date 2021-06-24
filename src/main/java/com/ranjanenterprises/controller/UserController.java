package com.ranjanenterprises.controller;

import com.ranjanenterprises.representation.ResponseData;
import com.ranjanenterprises.representation.UserRequest;
import com.ranjanenterprises.representation.UserResponse;
import com.ranjanenterprises.representation.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<ResponseData> getAllUsers() {

        Users response1 = Users.UsersBuilder.anUsers()
                        .withName("user1")
                        .withEmail("user1@gmail.com")
                        .withUsername("user1")
                        .build();

        Users response2 = Users.UsersBuilder.anUsers()
                        .withName("user2")
                        .withEmail("user2@gmail.com")
                        .withUsername("user2")
                        .build();

        Users response3 = Users.UsersBuilder.anUsers()
                        .withName("user3")
                        .withEmail("user3@gmail.com")
                        .withUsername("user3")
                        .build();

        ResponseData data = ResponseData.ResponseDataBuilder.aResponseData()
                        .withUsers(Arrays.asList(response1, response2, response3)).build();

        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<String> getUserById(@PathVariable("userId") String userName) {
        return new ResponseEntity<>("Welcome " + userName, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {

        UserResponse response = UserResponse.UserResponseBuilder.anUserResponse()
                        .withId(123)
                        .withMessage("User created successfully")
                        .withStatus("success")
                        .build();

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

}
