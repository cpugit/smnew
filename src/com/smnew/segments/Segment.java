package com.smnew.segments;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException();
        }
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    Point middle() {
        double midX = (start.getX() + end.getX()) / 2.0;
        double midY = (start.getY() + end.getY()) / 2.0;
        return new Point(midX, midY);
    }

    public Point intersection(Segment another) {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();

        double x3 = another.start.getX();
        double y3 = another.start.getY();
        double x4 = another.end.getX();
        double y4 = another.end.getY();

        double denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        // Parallel or collinear
        if (denom == 0) {
            return null;
        }

        double px = ((x1*y2 - y1*x2) * (x3 - x4) - (x1 - x2) * (x3*y4 - y3*x4)) / denom;
        double py = ((x1*y2 - y1*x2) * (y3 - y4) - (y1 - y2) * (x3*y4 - y3*x4)) / denom;

        Point intersection = new Point(px, py);

        // Check if intersection lies on both segments
        if (isOnSegment(intersection, this) && isOnSegment(intersection, another)) {
            return intersection;
        }
        return null;
    }

    private boolean isOnSegment(Point p, Segment s) {
        return p.getX() >= Math.min(s.start.getX(), s.end.getX()) &&
                p.getX() <= Math.max(s.start.getX(), s.end.getX()) &&
                p.getY() >= Math.min(s.start.getY(), s.end.getY()) &&
                p.getY() <= Math.max(s.start.getY(), s.end.getY());
    }
}
