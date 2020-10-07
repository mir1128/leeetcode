package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class LastStoneWeightII1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = IntStream.of(stones).sum();
        int[][] dp = new int[stones.length][sum / 2 + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = 1; j <= sum / 2; j++) {
                if (stones[i] > j) {
                    dp[i][j] = i>= 1? dp[i-1][j] : 0;
                    continue;
                }

                dp[i][j] = Math.max((i >= 1 ? dp[i - 1][j - stones[i]] : 0) + stones[i], i >= 1 ? dp[i-1][j] : 0);
            }
        }
        return sum - 2 * dp[stones.length - 1][sum / 2];
    }
}
