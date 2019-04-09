package com.sirniclolas.spring.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppGeneric {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-generic.xml");
        UserService userService = (UserService)context.getBean("userService");
        userService.add();
    }
}
