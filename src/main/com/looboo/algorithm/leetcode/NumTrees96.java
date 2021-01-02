package com.looboo.algorithm.leetcode;

public class NumTrees96 {
    public int numTrees(int n) {

        if (n == 1) return 1;

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += (dp[j - 1] * dp[i - j]);
            }
            dp[i] = sum;
        }
        return dp[n];
    }
}
