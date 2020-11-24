package com.looboo.algorithm.leetcode;

public class MinRefuelStops871 {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        int n = stations.length;

        if (n == 0) {
            if (startFuel >= target) return 0;
            else return -1;
        }

        int[][][] dp = new int[n][n + 1][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        dp[0][0][0] = startFuel - stations[0][0];

        if (startFuel - stations[0][0] >= 0) {
            dp[0][1][1] = startFuel - stations[0][0] + stations[0][1];
        } else {
            return -1;
        }

        System.out.println("station: " + 0);
        Utils.print(dp[0]);

        for (int i = 1; i < n; i++) {
            int cost = stations[i][0] - stations[i - 1][0];
            for (int j = 0; j <= i + 1; j++) {
                int a1 = Math.max(dp[i - 1][j][0], dp[i - 1][j][1]) - cost;
                dp[i][j][0] = a1 >= 0 ? a1 : -1;

                if (j > 0) {
                    a1 = Math.max(dp[i - 1][j - 1][0], dp[i - 1][j - 1][1]) - cost;
                    dp[i][j][1] = a1 >= 0 ? a1 + stations[i][1] : -1;
                }
            }
            System.out.println("station: " + (i - 1));
            Utils.print(dp[i]);
        }

        int result = -1;
        for (int i = 0; i <= n; i++) {
            if (Math.max(dp[n - 1][i][0], dp[n - 1][i][1]) >= (target - stations[n - 1][0])) {
                result = i;
                break;
            }
        }

        return result;
    }
}
