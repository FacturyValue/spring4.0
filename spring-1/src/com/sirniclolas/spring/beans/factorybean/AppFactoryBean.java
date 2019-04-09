package com.sirniclolas.spring.beans.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFactoryBean {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans-factorybean.xml");

        Car car= (Car) context.getBean("car");
        System.out.println(car);
    }
}
