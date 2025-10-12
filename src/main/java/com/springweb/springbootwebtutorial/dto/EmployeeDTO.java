package com.springweb.springbootwebtutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springweb.springbootwebtutorial.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Locale;

//DTO= Data Transfer Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Required field in Employee:name is not empty")
    @Size(min = 3,max = 10,message = "number of character in range")
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "email should be a  valid email")
    private String email;

    @NotNull(message = "Age cannot be null")
    @Max(value = 80, message = "Age cannot be greater than 80")
    @Min(value = 18,message = "age of cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$",message = "Role can be Admin or user")
    @EmployeeRoleValidation
    private String role; //ADMIN USER

    @NotNull(message = "Salary of employee should be not null")
    @Positive(message = "Salary of employee should be positive")
    @Digits(integer = 6,fraction = 2,message = "salary can be in the form XXXXX.YY ")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "date of joining cannot be in the future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "employee should be active")
    @JsonProperty("isActive")
    private Boolean isActive;


}