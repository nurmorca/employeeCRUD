package com.morca.springboot.thymeleafdemo.controller;

import com.morca.springboot.thymeleafdemo.entity.Employee;
import com.morca.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employees")
@Controller
public class EmployeeController {
    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployee(Model model) {
        // getting employees from db
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employees", employeeList);

        // direct to list-employees.html.
        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employees/employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("id") int Id, Model model) {
        Employee e = employeeService.findById(Id);
        model.addAttribute("employee", e);
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee e) {
        employeeService.save(e);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
}
