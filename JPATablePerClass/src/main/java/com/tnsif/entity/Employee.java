package com.tnsif.entity;

import jakarta.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private double salary;

    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;

    }
}
