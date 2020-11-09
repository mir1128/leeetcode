package com.looboo.algorithm.leetcode;

public class MaxProfit122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;

        int[][] state = new int[n][2];

        state[0][0] = 0;
        state[0][1] = -prices[0];

        for (int i = 1; i < n; i++) {
            state[i][0] = Math.max(state[i-1][0], state[i-1][1] + prices[i]);
            state[i][1] = Math.max(state[i-1][1], state[i-1][0] - prices[i]);
        }

        return state[n-1][0];
    }
}
