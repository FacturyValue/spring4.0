package com.sirniclolas.spring.beans.autowire;

public class Car {
    private  String brand;
    private  double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    public Car(){
        System.out.println("Car's Constructor .................");
    }
}
