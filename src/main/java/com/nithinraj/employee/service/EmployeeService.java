package com.nithinraj.employee.service;

import com.nithinraj.employee.entity.Employee;
import com.nithinraj.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import com.nithinraj.employee.exception.EmployeeNotFoundException;


import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();

    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found with id: " + id)
                );
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee existingEmployee = repository.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee not found with id: " + id)
                );

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());
        existingEmployee.setSalary(updatedEmployee.getSalary());

        return repository.save(existingEmployee);
    }


}
