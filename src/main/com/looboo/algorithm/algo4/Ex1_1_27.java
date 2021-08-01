package com.looboo.algorithm.algo4;

public class Ex1_1_27 {

    public static double binomial(int N, int k, double p) {

        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;

        return (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomial1(int N, int k, double p) {

        double[][] dp = new double[N + 1][k + 1];

        dp[0][0] = 1.0;

        for (int i = 1; i <= N; i++) {
            dp[i][0] = (1 - p) * dp[i - 1][0];
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i][j] = (1 - p) * dp[i - 1][j] + p * dp[i - 1][j - 1];
            }
        }
        return dp[N][k];
    }


    public static void main(String[] args) {
        System.out.println(Ex1_1_27.binomial(100, 50, 0.25));
    }
}
