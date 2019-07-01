package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    OddEven oddEven;
    @Before
    public void setUp() {
        //arrange
        oddEven = new OddEven();
    }

    @After
    public void tearDown() {
        //arrange
        oddEven= null;
    }
    @Test
    public void oddEvenCheck()
    {
        oddEven=new OddEven();
        int a[]={2,31,45,62};
        String[] str=oddEven.oddEven(a);
        String[] str2={"even","odd","odd","even"};
        assertArrayEquals(str,str2);//checking expected and actual values weather even or odd
    }
    @Test
    public void primeCheck()
    {
        oddEven=new OddEven();
        int a[]={2,31,45,62};
        int[] r=oddEven.primeChecking(a);
        int[] res={45,62};
        assertArrayEquals(res,r);//checking expected and actual values if it is a prime number

    }
    @Test
    public void reverseArray()
    {
        oddEven=new OddEven();
        int a[]={43,5,8,1};
        int[] r=oddEven.reverse(a);
        int[] res={1,8,5,43};
        assertArrayEquals(res,r);//checking expected and actual values and making the reverse orders
    }
}
