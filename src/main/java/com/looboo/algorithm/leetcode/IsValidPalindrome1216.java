package com.looboo.algorithm.leetcode;

public class IsValidPalindrome1216 {
    public boolean isValidPalindrome(String s, int k) {

        int n = s.length();

        int[][] dp = new int[n + 1][n];

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                if (len == 1) {
                    dp[len][start] = 0;
                } else if (len == 2) {
                    if (s.charAt(start) == s.charAt(start + 1)) {
                        dp[len][start] = 0;
                    } else {
                        dp[len][start] = 1;
                    }
                } else {
                    if (s.charAt(start) == s.charAt(start + len - 1)) {
                        dp[len][start] = dp[len - 2][start + 1];
                    } else {
                        dp[len][start] = Math.min(dp[len - 1][start + 1], dp[len-1][start]) + 1;
                    }
                }
            }
        }

        return dp[n][0] <= k;
    }
}
