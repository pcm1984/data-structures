package com.pankaj.ds.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateInArray {

    public int firstDuplicate(int[] arr) {
        Set<Integer> intSet = new HashSet<>();
        for (int item : arr) {
            boolean isAdded = intSet.add(item);
            if (!isAdded) {
                return item;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        FirstDuplicateInArray firstDuplicateInArray = new FirstDuplicateInArray();
        int[] arr = {2,1,2,5,3,2};
        int duplicate = firstDuplicateInArray.firstDuplicate(arr);
        System.out.print(duplicate);
    }
}
