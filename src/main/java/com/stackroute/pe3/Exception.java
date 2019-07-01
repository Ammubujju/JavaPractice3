package com.stackroute.pe3;

public class Exception {
    public String ArithmeticException(int a, int b) {
        try {
            int c = a / b;  // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            return "Can't divide a number by 0";
        }
        return null;
    }

    public String NegativeArraySizeException(int a) {
        int arrSize = a;
        try {
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException ex) {
            return "Can't create array of negative size";
        }
        return null;
    }

    public String NullPointerException(int b) {
        try {
            String str = null; //null value
            System.out.println(str.charAt(b));
        } catch (NullPointerException e) {
            return "NullPointerException..";
        }
        return null;

    }

    public String ArrayIndexOutOfBound(int a) {

        int m[] = {40, 50, 60};

        try {
            System.out.println(m[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Wrong index number, please enter correct number. ";
        }
        return null;
    }

    public String StringIndexOutOfBoundsException (int a) {
        String str = "hello";
        try
        {
            System.out.println(str.charAt(a));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            return "Wrong character index number, please enter correct number. ";
        }
        return null;
    }

}
