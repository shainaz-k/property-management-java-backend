package com.property.management.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    @Size(min = 1, max = 50, message = "Email must be between 1 and 50 characters")
    @NotNull(message = "Email is required")
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    @NotNull(message = "Password is required")
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    private String houseNumber;
    private String street;
    private String city;
    private String postalCode;
    private String country;
}
