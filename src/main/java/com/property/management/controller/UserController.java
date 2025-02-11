package com.property.management.controller;

import com.property.management.dto.UserDTO;
import com.property.management.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*")
public class UserController {

   @Autowired
   private UserService userService;

    @ApiOperation(value = "register", notes = "This method is used for user registration")
    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@ApiParam(
            name = "userDTO",
            type = "UserDTO",
            value = "User data",
            example = "user information",
            required = true
    ) @Valid @RequestBody UserDTO userDTO){
        userDTO = userService.register(userDTO);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @PostMapping(path = "/login", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<UserDTO> login(@Valid @RequestBody UserDTO userDTO){
        userDTO = userService.login(userDTO.getEmail(), userDTO.getPassword());
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
