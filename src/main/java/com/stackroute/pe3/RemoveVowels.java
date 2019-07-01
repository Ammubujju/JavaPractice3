package com.stackroute.pe3;

public class RemoveVowels {
    public  String[] vowelsRemove(String[] instruments) {



        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aeiou]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }
    public String nullPointerException(String str) {

        String str1="";
        if (str == "") {
            str1 = "input string cannot be null";

        }

        return str;
    }
    public String removeVowels(String str) {
        str = str.replaceAll("[aeiou]", "");

        return str;
    }


    public String numericalValues(String str){
        String str1="";
        if (!str.matches("[a-zA-Z_]+")) {

            str = "input string should have only characters";

        }

        return str1;

    }
}
