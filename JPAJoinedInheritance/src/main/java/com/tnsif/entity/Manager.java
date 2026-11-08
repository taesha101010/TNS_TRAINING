package com.tnsif.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager")

public class Manager extends Employee{

    private String departmentName;

    public Manager(){

    }

    public Manager(String departmentName){
        this.departmentName = departmentName;
    }

    public Manager(String name, double salary, String departmentName) {
        super(name,salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void setDepartmentName(){
        this.departmentName = departmentName;

    }}
