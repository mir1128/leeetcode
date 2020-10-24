package com.looboo.algorithm.leetcode;

public class MinDistance583 {
    public int minDistance(String word1, String word2) {

        if (word1.length() == 0) return word2.length();
        if (word2.length() == 0) return word1.length();

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = (i > 0 && j > 0) ? dp[i - 1][j - 1] + 1 : 1;
                } else {
                    dp[i][j] = Math.max( i> 0 ? dp[i - 1][j] : 0 , j > 0 ? dp[i][j - 1] : 0);
                }
            }
        }
        Utils.print(dp);

        return m - dp[m - 1][n - 1] + n - dp[m - 1][n - 1];
    }
}
