package com.looboo.algorithm.leetcode;

public class ProbabilityOfHeads1230 {
    public double probabilityOfHeads(double[] prob, int target) {
        double[][] dp = new double[prob.length + 1][prob.length];

        for (int i = 0; i < prob.length; i++) {
            dp[0][i] = (i == 0 ? prob[0] : dp[0][i - 1] * prob[i]);
        }

        for (int count = 1; count <= prob.length; count++) {
            for (int i = count - 1; i < prob.length; i++) {
                if (i == count - 1) {
                    dp[count][i] = i == 0 ? prob[i] : dp[count - 1][i - 1] * prob[i];
                } else {
                    dp[count][i] = dp[count - 1][i - 1] * prob[i] + dp[count][i - 1] * (1 - prob[i]);
                }
            }
        }

        return dp[target][prob.length - 1];
    }
}
