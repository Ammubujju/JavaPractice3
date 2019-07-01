package com.stackroute.pe3;

public class StringArray {
    public String compareString(String[] str1,String[] str2) {
        String result = "";

        if (str1.length == str2.length) {
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] == str2[i]) {
                    result = "equal";
                } else {
                    result = "not equal";
                    break;
                }
            }

        } else {
            result = "not equal";
        }

        return result;
    }
    /*  public static String[] removeDuplicateElements(String[] s1) {
          int n = s1.length;
          int index = 0;
          for (int i = 0; i < n; i++) {
              int j;
              for (j = 0; j < i; j++)
                  if (s1[i] == s1[j])
                      break;
              if (j == i)
                  s1[index++] = s1[i];
          }
          return s1;
      }*/
    public String removeDuplicateElements(String[] x)
    {
        String result="";
        for(int i=0;i<x.length;i++)
        {
            for(int j=1;j<x.length;j++)
            {
                if(x[i]==x[j]){
                    result="duplicates found";

                    break;

                }
                else{

                    result="no duplicates";
                }
            }
        }

        return result;
    }


    public String[] isAppen(String[] x,String[] y)
    {
        String[] result=new String[x.length+1];
        for(int i=0;i<x.length;i++)
        {
            result[i]=x[i];

        }
        result[result.length-1]=y[0];

        return result;
    }


    public String[] isPrepen(String[] x,String[] y) {
        String[] result = new String[x.length + 1];
        String temp = y[y.length / 2];
        for (int i = 0, j = 1; i < x.length && j < result.length; i++, j++) {

            result[j] = x[i];

        }

        result[0] = temp;

        return result;
    }
}
