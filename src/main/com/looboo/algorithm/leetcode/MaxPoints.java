package com.looboo.algorithm.leetcode;

public class MaxPoints {
    public long maxPoints(int[][] points) {

        int m = points.length;
        int n = points[0].length;
        long[][] dp = new long[m][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = points[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = points[i][j] + dp[i - 1][0] - j;
                for (int k = 1; k < n; k++) {
                    dp[i][j] = Math.max(dp[i][j], points[i][j] + dp[i - 1][k] - Math.abs(k - j));
                }
            }
        }

        long res = -1;
        for (int i = 0; i < dp[m - 1].length; i++) {
            res = Math.max(res, dp[m - 1][i]);
        }
        Utils.print(dp);
        return res;
    }
}
