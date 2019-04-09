package com.sirniclolas.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<String,Car> cars=null;

    public InstanceCarFactory(){
        cars = new HashMap<>();
        cars.put("audi",new Car("audi",200000,200));
        cars.put("lexus",new Car("lexus",300000,300));
    }

    public Car getCar(String name){
         return cars.get(name);

    }
}
