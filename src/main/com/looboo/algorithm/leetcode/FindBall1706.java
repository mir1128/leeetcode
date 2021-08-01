package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class FindBall1706 {
    public int[] findBall(int[][] grid) {

        int n = grid[0].length;
        if (n == 1) return new int[]{-1};

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = i;
        }

        for (int i = 0; i < grid.length; i++) {
            int[] current = new int[n];
            Arrays.fill(current, -1);

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (dp[j + 1] != -1 && grid[i][j + 1] == -1 && grid[i][j] == -1) {
                        current[j] = dp[j + 1];
                    }
                } else if (j == n - 1) {
                    if (dp[j - 1] != -1 && grid[i][j] == 1 && grid[i][j - 1] == 1) {
                        current[j] = dp[j - 1];
                    }
                } else {

                    if (grid[i][j] == 1) {
                        if (grid[i][j-1] == 1 && dp[j-1] != -1) {
                            current[j] = dp[j - 1];
                        }
                    } else {
                        if (grid[i][j+1] == -1 && dp[j+1] != -1) {
                            current[j] = dp[j + 1];
                        }
                    }
                }
            }
            dp = current;
        }

        int[] result = new int[n];
        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {
            if (dp[i] != -1) {
                result[dp[i]] = i;
            }
        }

        return result;
    }
}
