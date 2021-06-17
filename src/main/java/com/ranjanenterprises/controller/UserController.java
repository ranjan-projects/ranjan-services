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

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @RequestMapping("/services/status")
    public ResponseEntity<String> statusController() {
        return new ResponseEntity<>("Service is up and running", HttpStatus.OK);
    }

    @GetMapping("/users/{userName}/values")
    public ResponseEntity<String> getUserDetailsController(@PathVariable("userName") String userName) {
        return new ResponseEntity<>("Welcome " + userName, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseData> getUserDetailController() {

        Users response1 = Users.UsersBuilder.anUsers()
                        .withName("Punam")
                        .withEmail("Punam@gmail.com")
                        .withUsername("punam")
                        .build();

        Users response2 = Users.UsersBuilder.anUsers()
                        .withName("Tripti")
                        .withEmail("Tripti@gmail.com")
                        .withUsername("Tripti")
                        .build();

        Users response3 = Users.UsersBuilder.anUsers()
                        .withName("Rahul")
                        .withEmail("Rahul@gmail.com")
                        .withUsername("Rahul")
                        .build();

        ResponseData data = ResponseData.ResponseDataBuilder.aResponseData()
                        .withUsers(Arrays.asList(response1, response2, response3)).build();

        return new ResponseEntity<>(data, HttpStatus.OK);
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
