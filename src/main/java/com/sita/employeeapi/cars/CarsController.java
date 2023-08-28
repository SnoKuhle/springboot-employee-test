package com.sita.employeeapi.cars;

import com.sita.employeeapi.employee.Employee;
import com.sita.employeeapi.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping
    public ResponseEntity <List<Cars>> listCars() {
        return ResponseEntity.ok().body(carsService.ListCars());
    }

    @PostMapping
    public ResponseEntity<Cars> saveCarsApi(@RequestBody Cars cars) {
        return ResponseEntity.created(null).body(carsService.saveCars(cars));
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteCarsApi(@PathVariable("id") long id) {
        carsService.deleteCars(id);
        return ResponseEntity.ok("Product is deleted successsfully");
    }
}
