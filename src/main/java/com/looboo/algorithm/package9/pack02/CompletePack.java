package com.looboo.algorithm.package9.pack02;

public class CompletePack {
    public int completePack(int V, int[][] items) {

        int[] dp = new int[V + 1];

        for (int i = 0; i < items.length; i++) {
            for (int j = items[i][0]; j <= V; j++) {
                dp[j] = Math.max(dp[j], dp[j-items[i][0]] + items[i][1]);
            }
        }

        return dp[V];
    }
}
