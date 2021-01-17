package com.looboo.algorithm.leetcode;

public class NumberOfWays1259 {
    public int numberOfWays(int num_people) {
        int mod = 1000000007;

        int[] dp = new int[num_people + 1];

        for (int i = 2; i <= num_people; i += 2) {
            dp[i] = 0;
            for (int j = 1; j < i; j += 2) {
                dp[i] = (dp[i] + (dp[j - 1] * dp[i - j - 1]) % mod) % mod;
            }
        }
        return dp[num_people];
    }
}
