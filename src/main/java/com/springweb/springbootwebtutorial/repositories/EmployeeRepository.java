package com.springweb.springbootwebtutorial.repositories;

import com.springweb.springbootwebtutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {


}
