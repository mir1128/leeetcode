package com.looboo.algorithm.leetcode;

public class LargestSumOfAverages813 {
    public double largestSumOfAverages(int[] A, int K) {

        int n = A.length;
        double[][] dp = new double[n][K + 1];

        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            sum[i] = (i == 0 ? A[0] : sum[i - 1] + A[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int k = 1; k <= K; k++) {
                if (k == 1) {
                    dp[i][k] = avg(sum, i, n - 1);
                    continue;
                } else {
                    for (int j = i + 1; j <= n - (k - 1); j++) {
                        dp[i][k] = Math.max(avg(sum, i, j - 1) + dp[j][k - 1], dp[i][k]);
                    }
                }
            }
        }
        Utils.print(dp);
        return dp[0][K];
    }

    private double avg(int[] sum, int start, int end) {

        if (start > end) return .0;

        if (start == 0) return (double) sum[end] / (end + 1);
        return ((double) sum[end] - sum[start - 1]) / (end - start + 1);
    }
}
