package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class MinCost256 {
    public int minCost(int[][] costs) {
        if (costs.length == 0) return 0;
        int n = costs.length;
        int[][] dp = new int[n][3];

        dp[0] = costs[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        return min(dp[n - 1]);
    }

    public int minCost1(int[][] costs) {
        if (costs.length == 0) return 0;

        int s0 = costs[0][0];
        int s1 = costs[0][1];
        int s2 = costs[0][2];

        for (int i = 1; i < costs.length; i++) {
            int a0 = costs[i][0] + Math.min(s1, s2);
            int a1 = costs[i][1] + Math.min(s0, s2);
            int a2 = costs[i][2] + Math.min(s0, s1);

            s0 = a0;
            s1 = a1;
            s2 = a2;
        }

        return min(s0, s1, s2);
    }


    private int min(int... arr) {
        return IntStream.of(arr).min().getAsInt();
    }
}
