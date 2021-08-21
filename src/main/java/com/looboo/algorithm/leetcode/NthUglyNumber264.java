package com.looboo.algorithm.leetcode;

public class NthUglyNumber264 {
    public int nthUglyNumber(int n) {

        int[] dp = new int[n];
        dp[0] = 1;

        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) {
            int a = Math.min(Math.min(dp[p2] * 2, dp[p3] * 3), dp[p5] * 5);
            dp[i] = a;
            if (a == dp[p2] * 2) p2++;
            if (a == dp[p3] * 3) p3++;
            if (a == dp[p5] * 5) p5++;
        }

        return dp[n - 1];
    }

}
