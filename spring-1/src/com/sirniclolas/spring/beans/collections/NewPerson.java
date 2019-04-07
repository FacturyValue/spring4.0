package com.sirniclolas.spring.beans.collections;

import com.sirniclolas.spring.beans.Car;

import java.util.List;
import java.util.Map;

public class NewPerson {
    private  String name;
    private  int age;
    private Map<String,Car> cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
