package com.EmployAPI.demo.Controller;

import com.EmployAPI.demo.Entity.Employee;
import com.EmployAPI.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee postDetails(@RequestBody Employee employee){
        return employeeService.saveDetails(employee);
    }

    @GetMapping("/getEmployee")
    public List<Employee> getDetails(){
        return employeeService.getallDetails();
    }

    @GetMapping("/printAllEmployees")
    public void printAllEmployee(){
        employeeService.printAllDetailsToConsole();
    }
}
