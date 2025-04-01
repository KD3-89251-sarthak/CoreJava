package com.app.geometry;


public class Point2D {
    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return string representation of point
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to check if two points are equal
    public boolean isEqual(Point2D other) {
        return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0;
    }

    // Method to calculate distance between two points
    public double calculateDistance(Point2D other) {
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }
}
