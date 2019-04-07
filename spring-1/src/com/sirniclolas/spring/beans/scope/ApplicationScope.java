package com.sirniclolas.spring.beans.scope;

import com.sirniclolas.spring.beans.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
        Car car = (Car) context.getBean("car");
        Car car2 = (Car) context.getBean("car");
//        System.out.println(car==car2);
    }

}
