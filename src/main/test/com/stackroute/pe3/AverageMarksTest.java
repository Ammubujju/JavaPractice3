package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageMarksTest {
    AverageMarks averageMarks=new AverageMarks();
    @Before
    public void setUp() {
        //arrange
        averageMarks= new AverageMarks();
    }

    @After
    public void tearDown() {
        //arrange
        averageMarks = null;
    }

    public void inBetweenZeroAndHundred()
    {
        String str=averageMarks.computeMarksEqual(20);
        assertEquals("true",str);//checking expected and actual values are equal
    }
    @Test
    public void greaterThan()
    {
        String str=averageMarks.computeMarksGreater(121);
        assertEquals("Input should not be greater than 100",str);//checking expected and actual values which input is not greater than 100
    }
    @Test
    public void lessThanZero()
    {
        String str=averageMarks.computeMarksLess(-5);
        assertEquals("Input should not be less than 0",str);//checking expected and actual values which input is not negative
    }


}
