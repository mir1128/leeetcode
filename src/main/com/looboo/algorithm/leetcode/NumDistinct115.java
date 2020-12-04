package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class NumDistinct115 {
    public int numDistinct(String s, String t) {
        int m = t.length();
        int n = s.length();

        int[][] dp = new int[m + 1][n + 1];

        Arrays.fill(dp[0], 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
