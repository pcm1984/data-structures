package com.pankaj.ds.stringmanipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    
    public static void main(String [] args){
        String string = "SSISS";
        System.out.println(getFirstNonRepeatingChar(string));
    }

    private static char getFirstNonRepeatingChar(String string) {

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        //First pass is to count the frequency of all the characters.
        for(char ch : string.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);
        }

        //Second pass is to find first character with only 1 occurance.
        for(char ch : string.toCharArray()){
            if(charCountMap.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }
}
