package com.looboo.algorithm.leetcode;

public class LongestPalindromeSubseq516 {
    public int longestPalindromeSubseq1(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (j == i) {
                    dp[i][j] = 1;
                } else {
                    int index = s.indexOf(s.charAt(j), i);
                    if (index == j) {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        if (index + 1 <= j - 1) {
                            dp[i][j] = Math.max(dp[index + 1][j - 1] + 2, dp[i][j - 1]);
                        } else { //index + 1 = j;
                            dp[i][j] = Math.max(2, dp[i][j - 1]);
                        }
                    }
                }
            }
        }
//        Utils.print(dp);
        return dp[0][n - 1];
    }

    public int longestPalindromeSubseq(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                if (len == 1) {
                    dp[start][start] = 1;
                } else if (len == 2) {
                    if (s.charAt(start) == s.charAt(start + 1)) {
                        dp[start][start + 1] = 2;
                    } else {
                        dp[start][start + 1] = 1;
                    }
                } else {
                    dp[start][start + len - 1] = Math.max(dp[start + 1][start + len - 1], dp[start][start + len - 2]);
                    if (s.charAt(start) == s.charAt(start + len - 1)) {
                        dp[start][start + len - 1]
                                = Math.max(dp[start][start + len - 1], dp[start + 1][start + len - 2] + 2);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}
