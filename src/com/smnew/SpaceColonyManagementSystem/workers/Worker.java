package com.smnew.SpaceColonyManagementSystem.workers;

import com.smnew.SpaceColonyManagementSystem.ColonyObject;

public abstract class Worker extends ColonyObject {

    String name;
    int energyLevel;
    private int satiety;
    private String specialization;

    abstract public void update ();
}
