package com.sita.employeeapi.cars;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {
    @GetMapping
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok().body("My First API!!!!s");
    }
}
