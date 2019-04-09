package com.sirniclolas.spring.beans.generic.di;

public class BaseRepository<T> {
    public void save(){
        System.out.println("BaseRepository save()..........");
    }
}
