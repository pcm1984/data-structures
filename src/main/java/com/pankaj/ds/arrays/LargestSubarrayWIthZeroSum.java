package com.pankaj.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWIthZeroSum {

    public int longestSubarrayWithZeroSum(int[] arr){
        int lengthOfLongestSubarray = 0;
        for(int i=0;i<(arr.length-1);i++){
            int currentSubarrayLength = 0;
            int currentSum = arr[i];
            for(int j = i + 1; j<arr.length;j++){
               currentSum += arr[j];
               if(currentSum == 0){
                   currentSubarrayLength = j-i;
               }
            }
            if(currentSubarrayLength > lengthOfLongestSubarray){
                lengthOfLongestSubarray = currentSubarrayLength;
            }
        }
        return lengthOfLongestSubarray;
    }

    public static int longestSubarrayWithZeroSumBetter(int[] arr) {
        // Map to store the cumulative sum and its first occurrence index
        Map<Integer, Integer> seen = new HashMap<>();
        int currentSum = 0;
        int longestSubarraySize = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Update the cumulative sum

            // Check if the cumulative sum is zero
            if (currentSum == 0) {
                longestSubarraySize = i; // Update longest subarray size
            } else {
                // If the cumulative sum has been seen before
                if (seen.containsKey(currentSum)) {
                    int subarrayLength = i - seen.get(currentSum);
                    if (subarrayLength > longestSubarraySize) {
                        longestSubarraySize = subarrayLength;
                    }
                } else {
                    // Store the cumulative sum with its index if it's not seen before
                    seen.put(currentSum, i);
                }
            }
        }

        return longestSubarraySize; // Return the maximum length of subarray with zero sum
    } // Return the maximum length of subarray with zero sum


    public static void main(String[] args){
        int [] array  = {1, -1, 3, 2, -2, -3, 3, 0};
        LargestSubarrayWIthZeroSum largestSubarrayWIthZeroSum = new LargestSubarrayWIthZeroSum();
        int lengthOfLongestSubarray = largestSubarrayWIthZeroSum.longestSubarrayWithZeroSumBetter(array);
        System.out.print(lengthOfLongestSubarray);
    }

}
