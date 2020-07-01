package com.hmtmcse.sbes.springbootelasticsearch.controller;

import com.hmtmcse.sbes.springbootelasticsearch.entity.Department;
import com.hmtmcse.sbes.springbootelasticsearch.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/save-all")
    public int saveAll(@RequestBody List<Department> departments) {
        departmentRepository.saveAll(departments);
        return departments.size();
    }

    @GetMapping("/list")
    public Iterable<Department> list() {
        return departmentRepository.findAll();
    }

    @GetMapping("/find-by-name/{firstName}")
    public List<Department> findByFirstName(@PathVariable String firstName) {
        return departmentRepository.findByFirstName(firstName);
    }

}
