package com.sirniclolas.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFactory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car = (Car) context.getBean("car");
        System.out.println(car);

        Car car2 = (Car)context.getBean("car2");
        System.out.println(car2);

    }
}
