package com.looboo.algorithm.leetcode;

public class IsScramble87 {
    public boolean isScramble(String s1, String s2) {
        int m = s1.length();
        boolean[][][] dp = new boolean[m][m][m + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j][1] = s1.charAt(i) == s2.charAt(j);
            }
        }

        for (int len = 2; len <= m; ++len) {
            for (int i = 0; i <= m - len; i++) {
                for (int j = 0; j <= m - len; j++) {
                    for (int k = 1; k < len; k++) {
                        if (dp[i][j][k] && dp[i + k][j + k][len - k]) {
                            dp[i][j][len] = true;
                            break;
                        }

                        if (dp[i][j + len - k][k] && dp[i + k][j][len - k]) {
                            dp[i][j][len] = true;
                            break;
                        }
                    }

                }
            }
        }
        return dp[0][0][m];
    }
}
