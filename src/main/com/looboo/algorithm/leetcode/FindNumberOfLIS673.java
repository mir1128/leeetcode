package com.looboo.algorithm.leetcode;

public class FindNumberOfLIS673 {
    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        dp[0] = 1;
        count[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            count[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        count[i] = 1;
                        dp[i] = dp[j] + 1;
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] *= count[j];
                    }
                    max = Math.max(dp[i], max);
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == max) {
                sum += count[i];
            }
        }
        return sum;
    }
}
