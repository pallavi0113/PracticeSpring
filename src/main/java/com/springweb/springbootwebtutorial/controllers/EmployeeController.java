package com.springweb.springbootwebtutorial.controllers;

import com.springweb.springbootwebtutorial.dto.EmployeeDTO;
import com.springweb.springbootwebtutorial.entities.EmployeeEntity;
import com.springweb.springbootwebtutorial.repositories.EmployeeRepository;
import com.springweb.springbootwebtutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: asdfd/@$&Asd";
//    }
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                                @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping
    String updateEmployeeById(){
        return "Hello from put";
    }
}
