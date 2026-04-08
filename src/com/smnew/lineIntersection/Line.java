package com.smnew.lineIntersection;

public class Line {

    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null; // parallel or same line
        }

        // Compute x
        int x = (other.b - this.b) / (this.k - other.k);

        // Compute y using one of the lines
        int y = this.k * x + this.b;

        return new Point(x, y);
    }

}
