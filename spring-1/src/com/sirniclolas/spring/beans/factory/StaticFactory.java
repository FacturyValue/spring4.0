package com.sirniclolas.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法
 */
public class StaticFactory {

    private static Map<String,Car> cars= new HashMap<>();

    static {
        cars.put("audi",new Car("audi",300000,300));
        cars.put("ford",new Car("ford",300000,300));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
