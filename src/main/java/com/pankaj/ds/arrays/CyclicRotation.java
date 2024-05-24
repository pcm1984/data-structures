package com.pankaj.ds.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public void rotate(int[] nums, int k) {
        // Your code here
        int[] newArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newArray[(i+k)%nums.length] = nums[i];
        }
    }

    public static void main(String[] args){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] array  = {7,2,8,3,5};
        cyclicRotation.rotate(array,2);
        Arrays.stream(array).forEach(System.out :: println);
    }
}
