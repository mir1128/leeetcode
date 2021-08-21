package com.looboo.algorithm.leetcode;

import java.util.PriorityQueue;

public class GetLeastNumbersOffer40 {
    public int[] getLeastNumbers(int[] arr, int k) {

        int[] rest = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            rest[i] = priorityQueue.poll();
        }
        return rest;
    }
}
