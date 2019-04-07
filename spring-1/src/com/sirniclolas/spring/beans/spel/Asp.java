package com.sirniclolas.spring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Asp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-spel.xml");
        Address address=(Address) context.getBean("address");
//        System.out.println(address);

        Car car =(Car)context.getBean("car");
//        System.out.println(car);
        
        Person person =(Person)context.getBean("person");
        System.out.println(person);
    }
}
