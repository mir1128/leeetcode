package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class MinCost1547 {
    public int minCost(int n, int[] cuts) {

        int cutLen = cuts.length;
        if (cutLen == 1) return n;

        Arrays.sort(cuts);
        int[] arr = new int[cutLen + 2];
        System.arraycopy(cuts, 0, arr, 1, cutLen);
        arr[cutLen + 1] = n;

        int length = arr.length;
        int[][] dp = new int[length + 1][length];
        for (int len = 1; len <= length; len++) {
            for (int start = 0; start <= length - len; start++) {
                if (len == 1) {
                    dp[len][start] = 0;
                } else if (len == 2) {
                    dp[len][start] = 0;
                } else {
                    dp[len][start] = Integer.MAX_VALUE;
                    for (int k = start + 1; k < start + len - 1; k++) {
                        dp[len][start] = Math.min(dp[len][start], dp[k - start + 1][start] + dp[start + len - k][k] + arr[start + len - 1] - arr[start]);
                    }
                }
            }
        }
        return dp[length][0];
    }
}
