package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyRandomTest {

    @Test
    public void test() {
        IRandom random = new Random5();
        MyRandom myRandom = new MyRandom(random);
        int actualResult = myRandom.generate();   
        assertEquals(5, actualResult);
    }
    
    @Test
    public void check_call() {
        Random6 spyRandom = new Random6();
        MyRandom myRandom = new MyRandom(spyRandom);
        myRandom.generate();  
        assertEquals(2, spyRandom.called);
    }
    
}
class Random6 implements IRandom {
    public int called = 0;;

    @Override
    public int getNumber() {
        called++;
        return 6;
    }
    
}


class Random5 implements IRandom {
    @Override
    public int getNumber() {
        return 5;
    }
    
}
