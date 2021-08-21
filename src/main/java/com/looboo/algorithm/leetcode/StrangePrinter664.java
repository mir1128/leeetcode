package com.looboo.algorithm.leetcode;

public class StrangePrinter664 {
    public int strangePrinter(String s) {

        int n = s.length();
        if (n == 0) return 0;

        int[][] dp = new int[n][n];
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                if (len == 1) {
                    dp[start][start] = 1;
                } else if (len == 2) {
                    dp[start][start + 1] = s.charAt(start) == s.charAt(start + 1) ? 1 : 2;
                } else {
                    dp[start][start + len - 1] = 1 + dp[start + 1][start + len - 1];
                    for (int k = start + 1; k <= start + len - 1; k++) {
                        if (s.charAt(k) == s.charAt(start)) {
                            int a1 = dp[start][k - 1] + (k == start + len - 1 ? 0 : dp[k + 1][start + len - 1]);
                            dp[start][start + len - 1] = Math.min(dp[start][start + len - 1], a1);
                        }
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}


