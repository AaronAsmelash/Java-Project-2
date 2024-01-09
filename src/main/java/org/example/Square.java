package org.example;

public class Square implements Shape {
    @Override
    public double calcArea(double side) {
        return side * side;
    }

    @Override
    public double calcPerimeter(double side) {
        return 4 * side;
    }
}
