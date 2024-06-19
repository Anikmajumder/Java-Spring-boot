package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {
    private Long id;
    
    @NotEmpty
    @Size(min = 2, message = "First Name should have atleast 2 characters")
    private String firstName;
    
    @NotEmpty
    @Size(min = 2, message = "Last Name should have atleast 2 characters")
    private String lastName;

    @NotEmpty
    @Email
    private String email;
}
