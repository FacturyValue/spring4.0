package com.sirniclolas.spring.beans.annotation;

import com.sirniclolas.spring.beans.annotation.controller.UserController;
import com.sirniclolas.spring.beans.annotation.repository.Impl.UserRepositoryImpl;
import com.sirniclolas.spring.beans.annotation.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");
//        TestObject testObject= (TestObject) context.getBean("testObject");
//        System.out.println("TestObject "+testObject);
        UserController userController= (UserController)context.getBean("userController");
        userController.execute();
//        System.out.println("userController: "+userController);
//        UserServiceImpl userService = (UserServiceImpl)context.getBean("userServiceImpl");
//        System.out.println("userService: "+userService);
//        UserRepositoryImpl userRepository = (UserRepositoryImpl)context.getBean("userRepositoryImpl");
//        System.out.println("userRepository: "+userRepository);
    }
}
