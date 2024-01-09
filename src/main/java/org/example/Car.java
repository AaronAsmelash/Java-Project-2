package org.example;

public class Car {
//    Create a Class Car that would have the following fields: carPrice and color
//and method calculateSalePrice() which should be returning a price of the
//car.
//Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
//and has its own implementation of calculateSalePrice() method in which
//returned price is calculated as following: if weight>2000 then returned price
//car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does its own implementation
//of calculateSalePrice(): if length of sedan is >20 feet then returned car price
//should include 5% discount, otherwise 10% discount
public double carPrice;
public String color;
public double calculateSalePrice(){
    return carPrice;
};
}
class Truck extends Car{
    public double weight;
    public double calculateSalesPrice(double weight){
        this.weight=weight;
        if (weight>2000){
            return carPrice*.1;
        }else {
            return carPrice*.2;
        }
    }
}
class Sedan extends Car{
    public int length;
    public double calculateSalePrice(int length){
        if(length>20){
            this.length=length;
            return carPrice*.05;
        }else{
            return carPrice*.1;
        }
    }
}
class Vehicle extends Car{
    public static void main(String[] args) {
    double carPrice = 100000;
    int length = 10;
    double weight = 3000;
    Car truck = new Truck();
        System.out.println(truck.calculateSalePrice());
    Car sedan = new Sedan();
        System.out.println(sedan.calculateSalePrice());
}}
