package com.EmployAPI.demo.Service;

import com.EmployAPI.demo.Entity.Employee;
import com.EmployAPI.demo.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveDetails(Employee employee){

        return  employeeRepo.save(employee);
    }

    public List<Employee> getallDetails(){
        return employeeRepo.findAll();
    }

    public void printAllDetailsToConsole(){
        List<Employee> employees = getallDetails();
        for (Employee employee: employees){
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Post: " + employee.getPost());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Contact: " + employee.getContact());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("--------------------------------------------------");

        }
    }

}
