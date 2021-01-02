package com.looboo.algorithm.leetcode;

import java.util.PriorityQueue;

public class MedianSlidingWindow480 {

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            if (i == 0) {

            } else {

            }
        }

        return null;
    }


    public static class MedianFinder {
        private PriorityQueue<Integer> large = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        private PriorityQueue<Integer> small = new PriorityQueue<>();

        public void add(int val) {
            if (small.size() >= large.size()) {
                small.add(val);
                large.add(small.poll());
            } else {
                large.add(val);
                small.add(large.poll());
            }
        }

        public double median() {
            if (large.size() < small.size()) {
                return small.peek();
            } else if (large.size() > small.size()) {
                return large.peek();
            }
            return (large.peek() + small.peek()) / 2.0;
        }
    }
}
