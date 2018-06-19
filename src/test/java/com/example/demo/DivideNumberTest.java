package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideNumberTest {

    @Test(expected=DivideOperationException.class)
    public void should_throw_exception_with_divided_by_zero() {
        DivideOperation operation = new DivideOperation();
        operation.calculate(2, 0);
    }
    
    @Test
    public void _4_divide_2_should_be_2() {
        DivideOperation operation = new DivideOperation();
        double actualResult = operation.calculate(4, 2);
        assertEquals(2, actualResult, 0.000); 
    }

}
