package com.example.demo;

interface IReadAndSaveService {
    void save();
    void get();
}

interface IReadAndSaveV2Service {
    void save();
    void get();
    void get2();
}

public interface IService {
    void save();
    void get();
    void update();
    void delete();
}

class User implements IReadAndSaveService {

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void get() {
        // TODO Auto-generated method stub
        
    }
   
}
