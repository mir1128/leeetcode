package com.looboo.algorithm.leetcode;

public class SuperEggDrop887 {
    public int superEggDrop(int K, int N) {

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= K; i++) {
            dp[1][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            dp[i][1] = i;
        }

        for (int i = 2; i <= K; i++) {
            for (int j = 2; j <= N; j++) {
                dp[j][i] = Integer.MAX_VALUE;

//                int left = 1;
//                int right = j;
//                while (left < right) {
//                    int mid = (left + right) / 2;
//                    if (dp[j - mid][i] < dp[mid - 1][i - 1]) {
//                        right = mid - 1;
//                    } else {
//                        left = mid;
//                    }
//                }
//                dp[j][i] = Math.max(dp[left - 1][i - 1], dp[j - left][i]) + 1;

                int left = 1;
                int right = j;
                int mid = left + (right - left + 1) / 2;

                int breakCount = dp[mid - 1][i - 1];
                int notBreakCount = dp[i - mid][i];
                if (breakCount > notBreakCount) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
                dp[j][i] = Math.max(dp[left - 1][i - 1], dp[i - left][i]) + 1;
            }
        }

        return dp[N][K];
    }
}
