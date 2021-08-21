package com.looboo.algorithm.leetcode;

public class StoneGame877 {
    public boolean stoneGame(int[] piles) {

        int n = piles.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] > 0;
    }

    public boolean stoneGame1(int[] piles) {
        int n = piles.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = piles[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[j] = Math.max(piles[i] - dp[j], piles[j] - dp[j-1]);
            }
        }
        return dp[n-1] > 0;
    }
}
