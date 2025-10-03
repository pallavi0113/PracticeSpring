package com.springweb.springbootwebtutorial.controllers;

import com.springweb.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: asdfd/@$&Asd";
//    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long Id){
        return new EmployeeDTO(Id, "Pallavi","pallavi@gmail.com", 25, LocalDate.of(2025,2,1), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hi age "+age+" "+sortBy;
    }

    @PostMapping
    public String updateNewEmployee(){
        return "Hello from Post";
    }

    @PutMapping
    String updateEmployeeById(){
        return "Hello from put";
    }
}
