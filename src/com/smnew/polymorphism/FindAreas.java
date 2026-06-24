package com.smnew.polymorphism;

public class FindAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(4, 6);

        System.out.println(r.area());
        System.out.println(t.area());
    }
}
