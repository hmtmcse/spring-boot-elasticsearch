package com.hmtmcse.sbes.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@Document(indexName = "department")
public class Department {

    @Id
    public String id;
    public String name;
    public String code;
    public String description;
    public String uuid;

}
