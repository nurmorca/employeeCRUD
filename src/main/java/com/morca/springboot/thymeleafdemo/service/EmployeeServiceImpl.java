package com.morca.springboot.thymeleafdemo.service;

import com.morca.springboot.thymeleafdemo.dao.EmployeeRepository;
import com.morca.springboot.thymeleafdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        employeeRepository = repository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee e = null;
        if(result.isPresent()) {
            e = result.get();
        }
        return e;
    }

    @Override
    public Employee save(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

}
