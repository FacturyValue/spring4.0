package com.sirniclolas.spring.beans.spel;


public class Person {
    private String name;
    private Car car;

    //引用address bean的city属性
    private  String city;
    //根据car 的price 确定info:  car price>300000 金领 否则 白领
    private  String info;


    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public String getCity() {
        return city;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
