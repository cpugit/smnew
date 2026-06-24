package com.smnew.SpaceColonyManagementSystem;

public abstract class Entity extends ColonyObject{

    String name;
    int energyLevel;
    private int satiety;
    private String specialization;

    abstract public void update ();
}
