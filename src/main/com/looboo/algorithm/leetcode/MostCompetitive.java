package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class MostCompetitive {

    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length - k;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length && n >= 0; i++) {
            while (!stack.isEmpty() && stack.peek() > nums[i] && n > 0) {
                stack.pop();
                --n;
            }
            stack.push(nums[i]);
        }

        return stack.subList(0, k).stream().mapToInt(i -> i).toArray();
    }
}
