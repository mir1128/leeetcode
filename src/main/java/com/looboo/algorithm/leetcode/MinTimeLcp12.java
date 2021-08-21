package com.looboo.algorithm.leetcode;

public class MinTimeLcp12 {
    public int minTime(int[] time, int m) {

        int n = time.length;
        int[][] dp = new int[n][m + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= m; j++) {
                if (j == 1) {
                    dp[i][j] = sumExclude1(time, i, n - 1);
                    continue;
                } else {
                    if (i + j >= n) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Integer.MAX_VALUE;
                        for (int k = i; k < n - (j - 1); k++) {
                            int temp = Math.max(sumExclude1(time, i, k), dp[k + 1][j - 1]);
                            dp[i][j] = Math.min(temp, dp[i][j]);
//                            System.out.println(String.format("i = %s, j = %s, k = %s, dp[i][j] = %s", i, j, k, dp[i][j]));
                        }
                    }
                }
            }
        }

        Utils.print(dp);

        return dp[0][m];
    }

    private int sumExclude1(int[] time, int start, int end) {
        if (start == end) return 0;

        int max = time[start];
        int sum = 0;
        for (int i = start; i <= end; ++i) {
            sum += time[i];
            max = Math.max(time[i], max);
        }
        return sum - max;
    }

    public int minTime1(int[] time, int m) {
        int left, right, middle;
        left = right = 0;
        for (int i = 0; i < time.length; ++i) {
            right += time[i];
        }
        while (left <= right) {
            middle = (left + right) >> 1;
            if (Check(middle, time, m)) right = middle - 1;
            else left = middle + 1;
        }
        return left;
    }

    private boolean Check(int limit, int[] cost, int day) {
        // 每组划分 limit 的最大和，贪心划分看有多少组
        int useday, totaltime, maxtime;
        useday = 1;
        totaltime = maxtime = 0;
        for (int i = 0; i < cost.length; ++i) {
            int nexttime = Math.min(maxtime, cost[i]);
            if (nexttime + totaltime <= limit) {
                totaltime += nexttime;
                maxtime = Math.max(maxtime, cost[i]);
            } else {
                ++useday;
                totaltime = 0;
                maxtime = cost[i];
            }
        }
        return (useday <= day);
    }
}
