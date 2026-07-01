package com.smnew.SpaceColonyManagementSystem.workers;

public class Astronaut extends Worker {

    public Astronaut(String name){
        super.name = name;
    }


    @Override
    public void update(){
        System.out.println("If there are tasks, he completes them (spends energy), " +
                "goes to the canteen if he is hungry");
    }

    @Override
    public void getReported() {
        System.out.println("Astronaut John. Status: Repairing generator. Energy: 75%");
        super.energyLevel = 75;

    }
}
