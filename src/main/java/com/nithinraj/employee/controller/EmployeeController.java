package com.nithinraj.employee.controller;

import com.nithinraj.employee.entity.Employee;
import com.nithinraj.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // ✅ SAVE EMPLOYEE

    @PostMapping
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    // ✅ GET ALL EMPLOYEES
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody Employee employee) {

        return service.updateEmployee(id, employee);
    }


}
