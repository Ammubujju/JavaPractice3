package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels  removeVowels = new RemoveVowels();;


    @Test
    public void removeVowels() {
        String[] str2 = {"India", "pakistan", "uzbekistan", "melbourne"};
        String[] str = removeVowels.vowelsRemove(str2);
        String[] str1 = {"Ind", "pkstn", "zbkstn", "mlbrn"};
        assertArrayEquals(str1, str);//checking expected and actual values


    }
    /*@Test
    public void AllVowels() {
        String[] str2 = {"aeiou"};
        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {""};
        assertArrayEquals(str1, str);
    }*/
    @Test
    public void AllVowels() {
        removeVowels = new RemoveVowels();
        String[] str2 = {"aeiou"};

        String[] str = removeVowels.vowelsRemove(str2);
        String[] str1 = {""};

        assertArrayEquals(str1, str);//checking expected and actual values


    }

    @Test
    public void VowelsConsonants() {
        removeVowels = new RemoveVowels();
        String[] str2 = {"d", "a", "e", "f"};

        String[] str = removeVowels.vowelsRemove(str2);
        String[] str1 = {"d","","","f",} ;

        assertArrayEquals(str1, str);//checking expected and actual values


    }
  /*ublic void nullPointer() {
        removeVowels = new RemoveVowels();
        String s = "";

        String str = removeVowels.nullPointerException(s);
        assertEquals("input string cannot be null",str);//checking expected and actual values
    }*/
    @Test

    public void places2() {
        String str3 = "eaou";
        String result = removeVowels.removeVowels(str3);
        assertEquals("", result);//checking expected and actual values


    }
}
