package com.tnsif.entities;
import  jakarta.persistence.*;

@Entity
@Table(name = "emp_store")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "emp_type",
        discriminatorType = DiscriminatorType.STRING
)
@DiscriminatorValue("EMP")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }

}
