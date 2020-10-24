package com.looboo.algorithm.leetcode;

public class Rob01 {
    public int rob(int[] nums) {

        if (nums.length == 1) return nums[0];

        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    public int rob1(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int s1 = nums[0];
        int s2 = Math.max(nums[0], nums[1]);

        for (int i= 2; i < nums.length; ++i) {
            int tmp = Math.max(nums[i] + s1, s2);
            s1 = s2;
            s2 = tmp;
        }
        return s2;
    }
}
