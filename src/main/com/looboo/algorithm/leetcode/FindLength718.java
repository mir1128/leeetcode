package com.looboo.algorithm.leetcode;

public class FindLength718 {
    public int findLength(int[] A, int[] B) {

        int m = A.length;
        int n = B.length;

        int[][] dp = new int[m][n];

        int max = 0;
        for (int i = 0; i < m; i++) {
            if (A[0] == B[i]) {
                dp[0][i] = 1;
                max = 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (B[0] == A[i]) {
                dp[i][0] = 1;
                max = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                    }
                } else {
                    dp[i][j] = 1;
                }
            }
        }

        return max;
    }
}
