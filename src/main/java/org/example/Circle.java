package org.example;

public class Circle implements Shape {
    @Override
    public double calcArea(double radius) {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calcPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
