package com.sirniclolas.spring.beans.annotation.repository.Impl;

import com.sirniclolas.spring.beans.annotation.TestObject;
import com.sirniclolas.spring.beans.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepository Save...........");
//        System.out.println(testObject);
    }
}
