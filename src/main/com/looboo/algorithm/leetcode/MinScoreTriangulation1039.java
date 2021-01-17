package com.looboo.algorithm.leetcode;

public class MinScoreTriangulation1039 {
    public int minScoreTriangulation(int[] A) {

        int n = A.length;
        int[][] dp = new int[n][n];

        for (int len = 3; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                dp[start][start + len - 1] = Integer.MAX_VALUE;
                for (int k = start + 1; k < start + len - 1; k++) {
                    int a = dp[start][k] + dp[k][start + len - 1] + A[start] * A[k] * A[start + len - 1];
                    dp[start][start + len - 1] = Math.min(dp[start][start + len - 1], a);
                }
            }
        }

        return dp[0][n-1];
    }
}
