package com.looboo.algorithm.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastStoneWeight1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(i -> -i));
        queue.addAll(IntStream.of(stones).boxed().collect(Collectors.toList()));

        while (queue.size() > 1) {
            Integer poll1 = queue.poll();
            Integer poll2 = queue.poll();
            queue.add(poll1 - poll2);
        }
        return queue.peek();
    }


}
