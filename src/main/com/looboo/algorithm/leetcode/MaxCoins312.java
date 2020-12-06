package com.looboo.algorithm.leetcode;

public class MaxCoins312 {
    public int maxCoins(int[] nums) {

        int n = nums.length;
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = 1;
                for (int k = i; k <= j; k++) {
                    int a1 = nums[k] * (k - 1 < i ? 1 : nums[k - 1]) * (k + 1 > j ? 1 : nums[k + 1]);
                    int a2 = (k - 1 < i ? 0 : dp[i][k - 1]) + (k + 1 > j ? 0 : dp[k + 1][j]) + a1;

                    System.out.println(String.format("i = %s, j = %s, k = %s", i, j, k));
                    System.out.println("a2 = " + a2);
                    System.out.println("---------------------------------");
                    dp[i][j] = Math.max(a2, dp[i][j]);
                }
            }
        }

        Utils.print(dp);
        return dp[0][n-1];
    }
}
