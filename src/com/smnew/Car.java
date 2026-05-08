package com.smnew;

public class Car extends Vehicle {
    protected int maxSpeed = 300;
    public void showSpeed() {
        System.out.println(super.maxSpeed);
        System.out.println(maxSpeed);
    }
}