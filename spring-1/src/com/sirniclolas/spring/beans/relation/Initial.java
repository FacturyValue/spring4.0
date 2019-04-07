package com.sirniclolas.spring.beans.relation;

import com.sirniclolas.spring.beans.autowire.Address;
import com.sirniclolas.spring.beans.autowire.Person;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

public class Initial {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-relation.xml");
//        Address address =(Address)context.getBean("address");
//        System.out.println(address);
       Address  address= (Address) context.getBean("address2");
        System.out.println(address);

       Address  address3= (Address) context.getBean("address3");
        System.out.println(address3);

        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
