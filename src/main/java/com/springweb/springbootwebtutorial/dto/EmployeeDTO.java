package com.springweb.springbootwebtutorial.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Locale;

//DTO= Data Transfer Object
@Data
public class EmployeeDTO {
    private Long id;

    private String name;

    private String email;

    private Integer age;

    private LocalDate dateOfJoining;

    private Boolean isActive;


}