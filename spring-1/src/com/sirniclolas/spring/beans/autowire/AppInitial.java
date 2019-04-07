package com.sirniclolas.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitial {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowired.xml");
        Person person =(Person) context.getBean("person");
        System.out.println(person);
    }
}
