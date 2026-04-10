package com.company.management.model;

public class Manager extends Employee{
    private int teamSize;

    @Override
    void work (){
        System.out.println("Im a Manager");
    }
}
