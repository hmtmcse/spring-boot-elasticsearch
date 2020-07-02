package com.hmtmcse.sbes.springbootelasticsearch.repository;

import com.hmtmcse.sbes.springbootelasticsearch.entity.Department;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface DepartmentRepository extends ElasticsearchRepository<Department, String> {

    List<Department> findByName(String name);


}
