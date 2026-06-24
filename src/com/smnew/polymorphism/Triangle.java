package com.smnew.polymorphism;

public class Triangle extends Figure{

    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public double area(){
        System.out.println("Triangle");
        return dim1 * dim2 / 2;
    }
}
