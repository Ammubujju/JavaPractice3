package com.stackroute.pe3;

public class Consecutive {
    public String getConsecutiveNumbers(String str){
        String str1="consecutive";
        String str2="non consecutive";
        String[] str3=str.split(",");
        int [] arr = new int [str3.length];
        for(int i=0; i<str3.length; i++) {
            arr[i] = Integer.parseInt(str3[i]);
        }
        boolean result1=true;
        result1=checkConsecutive(arr);
        if(result1==true) {
            return str1;
        }
        else return str2;
    }
    public String getNegativeConsecutiveNumbers(String str){
        String str1="consecutive";
        String str2="non consecutive";
        String[] str3=str.split(",");
        int [] arr = new int [str3.length];
        for(int i=0; i<str3.length; i++) {
            arr[i] = Integer.parseInt(str3[i]);
        }
        boolean result1=true;
        result1=checkConsecutiveNegative(arr);
        if(result1==true) {
            return str1;
        }
        else return str2;
    }
    public static boolean checkConsecutive(int arr[]){

        boolean result=true;
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            if(((arr[i+1]-arr[i])!=1) &&((arr[i]-arr[i+1])!=1)){
                return false;
            }
        }
        return true;

    }
    public String getReverseConsecutiveNumbers(String str){
        String str1="consecutive";
        String str2="non consecutive";
        String[] str3=str.split(",");
        int [] arr = new int [str3.length];
        int [] arr2 = new int [str3.length];
        int j=arr.length;
        for(int i=0; i<str3.length; i++) {
            arr[i] = Integer.parseInt(str3[i]);
        }
        for(int i=0; i<str3.length;i++) {
            arr2[j-1] = arr[i];
            j--;
        }

        boolean result1;
        result1=checkConsecutive(arr2);
        if(result1==true) {
            return str1;
        }
        else{
            return str2;
        }
    }
    public static boolean checkConsecutiveNegative(int arr[]){

        boolean result=true;
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            if(((arr[i+1]-arr[i])!=-1) &&((arr[i]-arr[i+1])!=-1)){
                return false;
            }
        }
        return true;

    }

}
