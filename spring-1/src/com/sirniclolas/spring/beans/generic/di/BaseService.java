package com.sirniclolas.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Soundbank;

public class BaseService<T> {

    @Autowired
    protected  BaseRepository<T> baseRepository;

    public void add(){
        Class<? extends BaseService> aClass = this.getClass();
        System.out.println(aClass);
        System.out.println("add .........");
        System.out.println(baseRepository);
        baseRepository.save();
    }
}
