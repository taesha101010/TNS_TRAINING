package com.tnsif.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("MGR")

public class Manager extends Employee {

    private String departmentName;

    public Manager(){

    }

    public Manager(String name, double salary, String departmentName){
        super(name, salary);
        this.departmentName = departmentName;
    }

    public  String getDepartmentName(){
        return departmentName;
    }

    public void setDepartmentName(){
        this.departmentName = departmentName;
    }
}
