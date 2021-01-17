package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MedianSlidingWindow480 {

    public double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> large = new PriorityQueue<>();


        for (int i = 0; i < k; i++) {
            if (small.size() - large.size() > 0) {
                small.add(nums[i]);
                large.add(small.poll());
            } else {
                large.add(nums[i]);
                small.add(large.poll());
            }
        }

        double[] res = new double[nums.length - k + 1];
        int balance = small.size() - large.size();
        res[0] = balance > 0 ? small.peek() : ((double) small.peek() + large.peek()) / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] < small.peek()) {
                map.compute(nums[i - k], (key, v) -> v == null ? 1 : v + 1);
                balance--;
            } else if (nums[i - k] == small.peek()) {
                balance--;
                Integer poll = small.poll();
                while (map.containsKey(small.peek())) {
                    Integer poll1 = small.poll();
                    map.compute(poll1, (key, v) -> v - 1);
                    if (map.get(poll1) == 0) {
                        map.remove(poll);
                        break;
                    }
                }
            } else if (nums[i - k] == large.peek()) {
                balance++;
                Integer poll = large.poll();
                while (map.containsKey(large.peek())) {
                    Integer poll1 = large.poll();
                    map.compute(poll1, (key, v) -> v - 1);
                    if (map.get(poll1) == 0) {
                        map.remove(poll);
                        break;
                    }
                }
            } else {
                balance++;
                map.compute(nums[i - k], (key, v) -> v == null ? 1 : v + 1);
            }

            if (balance > 0) {
                small.add(nums[i]);
                large.add(small.poll());
                balance--;
            } else {
                large.add(nums[i]);
                small.add(large.poll());
                balance++;
            }
            res[i - k + 1] = balance > 0 ? small.peek() : ((double) small.peek() + large.peek()) / 2;
        }
        return res;
    }
}
