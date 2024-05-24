package com.pankaj.ds.arrays;

import java.util.Arrays;

public class ReverseArrayOrString {

    public String reverse(String s){
        if(s == null || s.isEmpty() || s.length() == 1) {
            return s;
        }

        int arrayLength = s.length();
        char[] reversedStringArray = new char[arrayLength];

        for(char ch : s.toCharArray()){
           reversedStringArray[--arrayLength]  = ch;
        }
        return String.valueOf(reversedStringArray);
    }
    public static void main(String[] args){
        ReverseArrayOrString reverseArrayOrString = new ReverseArrayOrString();
        String s = reverseArrayOrString.reverse("Pankaj");
        System.out.println(s);
    }
}
