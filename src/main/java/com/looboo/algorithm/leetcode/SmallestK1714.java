package com.looboo.algorithm.leetcode;

import java.util.PriorityQueue;

public class SmallestK1714 {
    public int[] smallestK(int[] arr, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.stream().mapToInt(i -> i).toArray();
    }
}
