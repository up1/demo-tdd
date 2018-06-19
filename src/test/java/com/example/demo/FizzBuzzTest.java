package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    FizzBuzz fizzBuzzz = new FizzBuzz();

    @Test
    public void should_say_1_when_input_1() {
        assertEquals("1", fizzBuzzz.say(1));
    }
    
    @Test
    public void should_say_2_when_input_2() {
        assertEquals("2", fizzBuzzz.say(2)); 
    }
    
    @Test
    public void should_say_Fizz_when_input_3() {
        assertEquals("Fizz", fizzBuzzz.say(3));
    }
    
    @Test
    public void should_say_4_when_input_4() {
        assertEquals("4", fizzBuzzz.say(4));
    }
    
    @Test
    public void should_say_Buzz_when_input_5() {
        assertEquals("Buzz", fizzBuzzz.say(5));
    }
    
    @Test
    public void should_say_Fizz_when_input_6() {
        assertEquals("Fizz", fizzBuzzz.say(6));
    }
    
    @Test
    public void should_say_Java_when_input_7() {
        assertEquals("Java", fizzBuzzz.say(7));
    }
    
    @Test
    public void should_say_8_when_input_8() {
        assertEquals("8", fizzBuzzz.say(8));
    }
    
    @Test
    public void should_say_Fizz_when_input_9() {
        assertEquals("Fizz", fizzBuzzz.say(9));
    }
    
    @Test
    public void should_say_Buzz_when_input_10() {
        assertEquals("Buzz", fizzBuzzz.say(10));
    }
    
    @Test
    public void should_say_FizzBuzz_when_input_15() {
        assertEquals("FizzBuzz", fizzBuzzz.say(15));
    }

}
