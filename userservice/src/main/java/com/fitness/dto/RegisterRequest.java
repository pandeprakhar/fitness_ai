package com.fitness.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank( message=" Email is requrired")
    @Email(message= " Invalid email format")
      private String email;
    @NotBlank(message = "pass is required")
    @Size(min=6, message= " message must be atleast 6")
      private String password;
      private String firstname;
      private String lastname;
}
