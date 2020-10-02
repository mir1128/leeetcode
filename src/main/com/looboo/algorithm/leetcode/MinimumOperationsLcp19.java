package com.looboo.algorithm.leetcode;

public class MinimumOperationsLcp19 {
    public int minimumOperations(String leaves) {

        int length = leaves.length();

        int[][] dp = new int[length][3];
        dp[0][0] = leaves.charAt(0) == 'y' ? 1 : 0;
        dp[0][1] = dp[0][2] = dp[1][2] = Integer.MAX_VALUE;

        for (int i = 1; i < length; i++) {
            dp[i][0] = dp[i - 1][0] + color(leaves.charAt(i), 'y');
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + color(leaves.charAt(i), 'r');
            if (i >= 2)
                dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][2]) + color(leaves.charAt(i), 'y');
        }

        return dp[length - 1][2];
    }

    private int color(char c, char target) {
        if (c == target) return 1;
        return 0;
    }

}
