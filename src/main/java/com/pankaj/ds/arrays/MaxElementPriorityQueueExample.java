package com.pankaj.ds.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxElementPriorityQueueExample {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1};

        // Create a priority queue and add all elements from the array
        Queue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int num : array) {
            priorityQueue.add(num);
        }

        // Retrieve the maximum element from the priority queue
        int maxElement = priorityQueue.poll();

        System.out.println("Maximum element: " + maxElement);
    }
}

