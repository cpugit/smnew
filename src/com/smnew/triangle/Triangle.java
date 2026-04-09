package com.smnew.triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException();
        }

        double area2 = (b.getX() - a.getX()) * (c.getY() - a.getY())
                - (b.getY() - a.getY()) * (c.getX() - a.getX());

        if (area2 == 0) {
            throw new IllegalArgumentException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double area2 = (b.getX() - a.getX()) * (c.getY() - a.getY())
                - (b.getY() - a.getY()) * (c.getX() - a.getX());

        return Math.abs(area2) / 2.0;
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3.0;
        double y = (a.getY() + b.getY() + c.getY()) / 3.0;

        return new Point(x, y);
    }
}

