package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class MinFallingPathSum931 {
    public int minFallingPathSum(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[0][i] = A[0][i];
        }


        if (n == 1) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += A[i][0];
            }
            return sum;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + A[i][j];
                } else if (j == n - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + A[i][j];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]) + A[i][j];
                }
            }
        }
        return Arrays.stream(dp[m - 1]).min().getAsInt();
    }
}
