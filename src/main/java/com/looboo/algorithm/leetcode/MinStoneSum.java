package com.looboo.algorithm.leetcode;

import java.util.PriorityQueue;

public class MinStoneSum {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> -a.compareTo(b));

        for (int i = 0; i < piles.length; i++) {
            queue.add(piles[i]);
        }

        int i = 0;
        while (i < k) {
            Integer poll = queue.poll();
            queue.add((poll + 1) / 2);
            i++;
        }

        return queue.stream().mapToInt(a -> a).sum();
    }
}
