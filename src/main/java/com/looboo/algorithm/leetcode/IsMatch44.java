package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class IsMatch44 {
    public boolean isMatch(String s, String p) {

        int m = p.length();
        int n = s.length();

        boolean[][] dp = new boolean[m][n];

        if (p.charAt(0) == '*') {
            Arrays.fill(dp[0], true);
        } else {
            Arrays.fill(dp[0], false);
            dp[0][0] = (p.charAt(0) == '?' || p.charAt(0) == s.charAt(0));
        }

        for (int i = 1; i < m; i++) {
            if (p.charAt(i) == '*') {

                int j = from(p, i);
                if (dp[i - 1][j - 1]) {
                    Arrays.fill(dp[i], i, n - 1, true);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || dp[i - 1][j - 1]) {
                        if (p.charAt(i) == '?' || p.charAt(i) == s.charAt(j)) {
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }

        Utils.print(dp);
        return dp[m - 1][n - 1];
    }

    private int from(String p, int index) {
        int res = 0;
        for (int i = 0; i < index; i++) {
            if (p.charAt(i) != '*') ++res;
        }
        return res;
    }

}
