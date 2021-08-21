package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class MinCut132 {
    boolean[][] can;

    public int minCut(String s) {
        int len = s.length();
        can = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            prePro(can, s, i, i, len);
            prePro(can, s, i, i + 1, len);
        }

        int[] dp = new int[len + 1];
        Arrays.fill(dp, len);
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (can[j][i]) {
                    dp[i + 1] = Math.min(dp[j] + 1, dp[i + 1]);
                }
            }
        }
        return dp[len] - 1;
    }

    private void prePro(boolean[][] dp, String str, int left, int right, int len){

        while(left >= 0 && right < len && str.charAt(left) == str.charAt(right)){
            dp[left][right] = true;
            left--;
            right++;
        }
    }
}
