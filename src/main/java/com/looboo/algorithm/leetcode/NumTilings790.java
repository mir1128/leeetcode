package com.looboo.algorithm.leetcode;

public class NumTilings790 {
    public int numTilings(int N) {
        int[] dp = new int[N + 1];

        if (N == 1) return 1;
        if (N == 2) return 2;
        if (N == 3) return 5;
        if (N == 4) return 11;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        dp[4] = 11;

        int mod = 1000000007;

        for (int i = 5; i <= N; i++) {
            dp[i] = ((dp[i - 1] + dp[i - 1]) % mod + dp[i - 3]) % mod;
        }

        return dp[N];
    }
}
