package com.looboo.algorithm.leetcode;

public class MinOperations5602 {
    public int minOperations(int[] nums, int x) {

        int[] dp = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            dp[i] = sum;
        }

        int target = dp[nums.length - 1] - x;

        int index = 0;
        int left = -1;
        int res = Integer.MAX_VALUE;
        while (index < nums.length) {
            while (left < index && (dp[index] - (left < 0 ? 0 : dp[left]) > target)) {
                left++;
            }
            if (dp[index] - (left < 0 ? 0 : dp[left]) == target) {
                res = Math.min(res, nums.length - (index - left));
            }
            ++index;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
