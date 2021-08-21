package com.looboo.algorithm.leetcode;

public class MaxProfit188 {
    public int maxProfit(int k, int[] prices) {
        return dfs(0, 0, k, 0, prices);
    }

    private int dfs(int index, int n, int k, int status, int[] prices) {
        if (index == prices.length || n == k) {
            return 0;
        }

        int a = dfs(index + 1, n, k, status, prices);

        int b;
        if (status == 0) {
            b = dfs(index + 1, n, k, 1, prices) - prices[index];
        } else {
            b = dfs(index+1, n+1, k, 0, prices) + prices[index];
        }

        return Math.max(a, b);
    }
}
