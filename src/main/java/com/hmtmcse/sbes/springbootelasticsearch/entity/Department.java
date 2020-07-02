package com.hmtmcse.sbes.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


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
