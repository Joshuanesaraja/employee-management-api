    package com.example.demo.controller;

    import java.util.List;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import com.example.demo.model.Employee;
    import com.example.demo.service.EmployeeService;

    @RestController
    @RequestMapping("/employees")
    public class EmployeeController {

        private final EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        @GetMapping
        public List<Employee> getAllEmployees() {
            return employeeService.getAllEmployees();
        }

        @PostMapping
        public Employee createEmployee(@RequestBody Employee employee) {
            return employeeService.saveEmployee(employee);
        }

        @PutMapping("/{id}")
        public Employee updateEmployee(@PathVariable Integer id,
                @RequestBody Employee employee) {
            return employeeService.updateEmployee(id, employee);
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Integer id) {
            return employeeService.getEmployeeById(id);
        }   
    }
