package com.sirniclolas.spring.beans.generic.di;

import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {
    public UserService() {
        System.out.println("UserService's Constructor.............");
    }
}
