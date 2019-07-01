package com.stackroute.pe3;

public class AverageMarks {
    public String computeMarksEqual(int marks){
        String result="";
        if(marks>0&&marks<100)
            result="true";
        return result;

    }
    public String computeMarksLess(int marks){
        String result="";
        if(marks<0)
            result="Input should not be less than 0";
        return result;

    }
    public String computeMarksGreater(int marks){
        String result="";
        if(marks>100) {
            result = "Input should not be greater than 100";
        }
        return result;

    }
}
