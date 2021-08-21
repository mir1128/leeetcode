package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class FindCheapestPrice787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int route[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(route[i], -1);
        }

        for (int i = 0; i < flights.length; i++) {
            route[flights[i][0]][flights[i][1]] = flights[i][2];
        }

        Utils.print(route);
        System.out.println("-----------------------");

        int dp[][] = new int[k + 1][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = route[src][i];
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (j == src) continue;
                int max = Integer.MAX_VALUE;
                for (int l = 0; l < n; l++) {
                    if (l == src) continue;

                    if (dp[i - 1][l] == -1 || route[src][l] == -1) continue;

                    if (dp[i - 1][l] + route[src][l] < max) {
                        max = dp[i - 1][l] + route[src][l];
                    }
                }
                dp[i][j] = max == Integer.MAX_VALUE ? -1 : max;
                System.out.println(String.format("i=%s,j=%s", i-1, j));
                Utils.print(dp);
                System.out.println("---------------------------");
            }
        }

        return dp[k][dst];
    }

    public static void main(String[] args) {
        int n = 5;
        int edges[][] = {{1, 2, 10}, {2, 0, 7}, {1, 3, 8}, {4, 0, 10}, {3, 4, 2}, {4, 2, 10}, {0, 3, 3}, {3, 1, 6}, {2, 4, 5}};
        int src = 0;
        int dst = 4;
        int k = 1;

        System.out.println(new FindCheapestPrice787().findCheapestPrice(n, edges, src, dst, k));
    }
}
