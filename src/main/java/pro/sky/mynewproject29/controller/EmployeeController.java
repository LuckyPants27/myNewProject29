package pro.sky.mynewproject29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.mynewproject29.model.Employee;
import pro.sky.mynewproject29.service.impl.EmployeeServiceImpl;

import java.util.Collection;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String firstName,
                        @RequestParam String lastName,
                        @RequestParam int salary,
                        @RequestParam int departmentId) {
        return employeeServiceImpl.add(firstName, lastName, salary, departmentId);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName,
                           @RequestParam String lastName
                           ) {
        return employeeServiceImpl.remove(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName,
                         @RequestParam String lastName
                         ) {
        return employeeServiceImpl.find(firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> findAll() {
        return employeeServiceImpl.findAll();
    }
}
