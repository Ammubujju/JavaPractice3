package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    Consecutive consecutive=new Consecutive();
    String str =" ";
    @Before
    public void setUp() {
        //arrange
        consecutive = new Consecutive();
    }

    @After
    public void tearDown() {
        //arrange
        consecutive = null;
    }

    @Test
    public void testConsecutiveNumbers() {

        String str = "10,11,12,13,14,15,16,17";
        //assert
        assertEquals(
                "check in sequential order if is it consecutive or not",
                "consecutive", consecutive.getConsecutiveNumbers(str));}
    @Test
    public void testConsecutiveNumber() {
        String str = "10,20,30,40,50,60";
        //assert
        assertEquals(
                "check is it non consecutive or not",
                "non consecutive", consecutive.getConsecutiveNumbers(str));
    }
    @Test
    public void givenInputsAreConsecutive() {
        String str = "11,10,9,8,7,6";
        //assert
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", consecutive.getReverseConsecutiveNumbers(str));
    }
    @Test
    public void giveninputsToTestConsecutiveNegatives() {
        String str = "0,-1,-2,-3,-4,-5";
        //assert
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", consecutive.getNegativeConsecutiveNumbers(str));}
    @Test
    public void givenInputsAreConsecutiveSame() {
        String str = "6,6,6,6,6,6";
        //assert
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "non consecutive", consecutive.getConsecutiveNumbers(str));
    }
}
