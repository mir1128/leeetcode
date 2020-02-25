package com.looboo.algorithm.leetcode;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKFrequent347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Long> counting = IntStream.range(0, nums.length)
                .map(i -> nums[i]).boxed().collect(Collectors.groupingByConcurrent(i -> i, Collectors.counting()));

        Queue<Map.Entry<Integer, Long>> queue = new PriorityQueue<>(Comparator.comparingLong(Map.Entry::getValue));

        counting.entrySet().stream().forEach(e -> {
            if (queue.size() == k) {
                if (e.getValue() > queue.peek().getValue()) {
                    queue.poll();
                    queue.add(e);
                }
            } else {
                queue.add(e);
            }
        });

        return queue.stream().map(e -> e.getKey()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int arr[] = {4,1,-1,2,-1,2,3};
        System.out.println(new TopKFrequent347().topKFrequent(arr, 2));
    }
}
