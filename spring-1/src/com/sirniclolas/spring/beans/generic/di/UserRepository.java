package com.sirniclolas.spring.beans.generic.di;

import org.springframework.stereotype.Repository;

import javax.sound.midi.Soundbank;

@Repository
public class UserRepository extends BaseRepository<User> {
    @Override
    public void save(){
        System.out.println("UserRepository save()执行了。。。。。。。。。。。。");
    }
}
