package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
    }

    public void deleteEmployee(Integer id) {
        Employee employee = getEmployeeById(id);
        employeeRepository.delete(employee);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee employeeDetails) {

        Employee employee = getEmployeeById(id);

        employee.setEname(employeeDetails.getEname());
        employee.setJob(employeeDetails.getJob());
        employee.setSal(employeeDetails.getSal());

        return employeeRepository.save(employee);
    }
}
