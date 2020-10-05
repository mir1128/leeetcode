package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class MaxProfit714 {
    //    public int maxProfit(int[] prices, int fee) {
//
//        if (prices.length == 1) return 0;
//
//        int[] dp = new int[prices.length];
//        dp[0] = 0;
//        dp[1] = Math.max(0, prices[1] - prices[0] - fee);
//
//        for (int i = 2; i < prices.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                int profit = prices[i] - prices[j] - fee;
//                if (j == 0) {
//                    dp[i] = max(profit, 0, dp[i]);
//                } else {
//                    dp[i] = max(profit + dp[j - 1], dp[i - 1], dp[i]);
//                }
//            }
//        }
//        return dp[prices.length - 1];
//    }
//
//    private int max(int ... arr) {
//        return IntStream.of(arr).max().getAsInt();
//    }
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];

        for (int i = 1; i < prices.length; ++i) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
