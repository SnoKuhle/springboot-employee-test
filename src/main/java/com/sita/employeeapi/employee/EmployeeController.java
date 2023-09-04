package com.sita.employeeapi.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> listEmployee() {
        return ResponseEntity.ok().body(employeeService.listEmployee());
    }
    @PostMapping
    public ResponseEntity<Employee> saveEmployeeApi(@RequestBody Employee employee) {
        return ResponseEntity.created(null).body(employeeService.saveEmployee(employee));
    }



}
