package com.pankaj.ds.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        if(s == null || s.isBlank()){
            return false;
        }

        StringBuilder stringToCompare = new StringBuilder();
        for(Character ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stringToCompare.append(Character.toLowerCase(ch));
            }
        }
        int start = 0;
        int end = stringToCompare.length()-1;

        while(start < end){
            if(stringToCompare.charAt(start) != stringToCompare.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "baab";
        System.out.println(isPalindrome(input)); // Expected output: true
    }
}

