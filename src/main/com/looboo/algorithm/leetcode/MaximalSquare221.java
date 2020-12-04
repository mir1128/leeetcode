package com.looboo.algorithm.leetcode;

public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];

        int max = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '0') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = min(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max * max;
    }

    private int min(int a1, int a2, int a3) {
        return Math.min(Math.min(a1, a2), a3);
    }
}
