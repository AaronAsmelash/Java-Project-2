package org.example;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.calcArea(10.0));
        System.out.println(circle.calcPerimeter(10));

        System.out.println("*****************************");

        Shape square = new Square();
        System.out.println(square.calcArea(10.0));
        System.out.println(square.calcPerimeter(10));

    }
}
