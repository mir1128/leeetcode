package com.looboo.algorithm.leetcode;

public class MinDistance72 {
    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m][n];

        if (word1.charAt(0) == word2.charAt(0)) {
            dp[0][0] = 0;
        } else {
            dp[0][0] = 1;
        }

        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + 1;
                } else {
                    if (word1.charAt(i) == word2.charAt(j)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i-1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
