package com.looboo.algorithm.leetcode;

public class CanPartition416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % 2 == 1) return false;

        int[][] dp = new int[nums.length][sum / 2 + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= sum / 2; j++) {
                if (i == 0) {
                    dp[0][j] = j >= nums[0] ? nums[0] : 0;
                } else {
                    dp[i][j] = j >= nums[i] ? Math.max(dp[i - 1][j - nums[i]] + nums[i], dp[i - 1][j]) : dp[i - 1][j];
                }
            }
        }

        Utils.print(dp);
        return dp[nums.length - 1][sum / 2] == sum / 2;
    }
}
