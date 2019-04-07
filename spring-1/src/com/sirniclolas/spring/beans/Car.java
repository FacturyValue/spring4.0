package com.sirniclolas.spring.beans;

public class Car {
    private String corp;
    private String brand;
    private  double price;
    private  int maxSpead;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxSpead(int maxSpead) {
        this.maxSpead = maxSpead;
    }

    public Car(String corp, String brand, double price) {
        this.corp = corp;
        this.brand = brand;
        this.price = price;
    }

    public Car(String corp, String brand, int maxSpead) {
        this.corp = corp;
        this.brand = brand;
        this.maxSpead = maxSpead;
    }

    @Override
    public String toString() {
        return "Car{" +
                "corp='" + corp + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", maxSpead=" + maxSpead +
                '}';
    }
}
