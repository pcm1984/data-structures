package com.pankaj.ds.arrays;

public class RemoveDuplicatesInPlace {

    public int removeDuplicates(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int lengthOfNewArray = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[lengthOfNewArray] = arr[i];
                lengthOfNewArray++;
            }
        }
        return lengthOfNewArray;
    }
    public static void main(String[] args){
        RemoveDuplicatesInPlace removeDuplicatesInPlace = new RemoveDuplicatesInPlace();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int arrayLength = removeDuplicatesInPlace.removeDuplicates(arr);
        System.out.println(arrayLength);

    }
}
