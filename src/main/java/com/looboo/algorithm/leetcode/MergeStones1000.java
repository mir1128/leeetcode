package com.looboo.algorithm.leetcode;

public class MergeStones1000 {
    private int MAX_VALUE = 99999999;

    public int mergeStones(int[] stones, int k) {
        int n = stones.length;
        if ((n - 1) % (k - 1) != 0) return -1;

        int[][][] dp = new int[n + 1][n + 1][k + 1];

        int[] sum = new int[n + 1];

        for (int i = 1; i <= n; ++i) sum[i] = sum[i - 1] + stones[i - 1];

        for (int i = 1; i <= n; ++i) {
            for (int j = i; j <= n; ++j) {
                for (int m = 2; m <= k; ++m) dp[i][j][m] = MAX_VALUE;
            }
            dp[i][i][1] = 0;
        }
        for (int len = 2; len <= n; ++len) { // 枚举区间长度
            for (int i = 1; i + len - 1 <= n; ++i) { // 枚举区间起点
                int j = i + len - 1;
                for (int m = 2; m <= k; ++m) { // 枚举堆数
                    for (int p = i; p < j; p += k - 1) {  // 枚举分界点
                        dp[i][j][m] = Math.min(dp[i][j][m], dp[i][p][1] + dp[p + 1][j][m - 1]);
                        System.out.println(String.format("聚成%s堆，从%s开始， 长度%s, 分割点 %s, 代价 %s", m, i, len, p, dp[i][j][m]));
                    }
                }
                dp[i][j][1] = dp[i][j][k] + sum[j] - sum[i - 1];
            }
        }
        return dp[1][n][1];
    }
}
