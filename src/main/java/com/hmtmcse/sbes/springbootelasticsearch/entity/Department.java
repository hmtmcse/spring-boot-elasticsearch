package com.hmtmcse.sbes.springbootelasticsearch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    public String id;
    public String name;
    public String code;
    public String description;
    public String uuid;

}
