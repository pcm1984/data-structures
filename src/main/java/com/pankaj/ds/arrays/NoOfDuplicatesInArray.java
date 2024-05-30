package com.pankaj.ds.arrays;

import java.util.HashSet;
import java.util.Set;

public class NoOfDuplicatesInArray {

    public int countDuplicates(int[] arr) {
        Set<Integer> intSet = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int item : arr){
            if(intSet.contains(item)){
                duplicates.add(item);
            }
            intSet.add(item);
        }
        return duplicates.size();
    }

    public static void main(String[] args){
        NoOfDuplicatesInArray noOfDuplicatesInArray = new NoOfDuplicatesInArray();
        int[] arr = {2,1,2,5,3,2,3,3,5};
        int duplicate = noOfDuplicatesInArray.countDuplicates(arr);
        System.out.print(duplicate);
    }
}
