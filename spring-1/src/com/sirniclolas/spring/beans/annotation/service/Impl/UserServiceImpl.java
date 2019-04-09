package com.sirniclolas.spring.beans.annotation.service.Impl;

import com.sirniclolas.spring.beans.annotation.repository.UserRepository;
import com.sirniclolas.spring.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    @Qualifier("userRepositoryImpl")
//    @Qualifier("userJdbcRepository")
    private UserRepository userRepository;
    @Autowired
    public void setUserRepository(@Qualifier("userRepositoryImpl")UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void add() {
        System.out.println("UserService add...........");
        userRepository.save();
    }
}
