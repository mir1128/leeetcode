package com.looboo.algorithm.leetcode;

import java.util.PriorityQueue;

public class LongestSubarray1438 {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        int left = 0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {

            maxQueue.add(nums[i]);
            minQueue.add(nums[i]);
            System.out.println("add: " + nums[i]);

            while (Math.abs(maxQueue.peek() - minQueue.peek()) > limit) {
                if (nums[left] == maxQueue.peek()) {
                    maxQueue.poll();
                }
                if (nums[left] == minQueue.peek()) {
                    minQueue.poll();
                }
                System.out.println("remove: " +  nums[left]);
                ++left;
            }

            maxLen = Math.max(maxLen, i - left + 1);
            System.out.println("maxLen: " + maxLen);
        }
        return maxLen;
    }
}
