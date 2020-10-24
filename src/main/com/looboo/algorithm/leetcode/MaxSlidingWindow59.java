package com.looboo.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow59 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length ==0 || k == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];

        Deque<Integer> deque = new LinkedList<>();
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i >= k) {
                if (nums[i - k] == deque.peekFirst()) {
                    res[curr] = deque.pollFirst();
                } else {
                    res[curr] = deque.peekFirst();
                }
                curr++;
            }

            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.pollLast();
            }
            deque.add(nums[i]);
        }
        res[curr]=deque.pollFirst();
        return res;
    }
}
