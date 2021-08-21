package com.looboo.algorithm.leetcode;

public class MaxProductPath5521 {
    public int maxProductPath(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        double dp[][][] = new double[2][m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[0][i][j] = grid[i][j];
                    dp[1][i][j] = grid[i][j];
                } else if (i == 0 && j != 0) {
                    dp[0][i][j] = grid[i][j] * dp[0][i][j - 1];
                    dp[1][i][j] = grid[i][j] * dp[1][i][j - 1];
                } else if (i != 0 && j == 0) {
                    dp[0][i][j] = grid[i][j] * dp[0][i - 1][j];
                    dp[1][i][j] = grid[i][j] * dp[1][i - 1][j];
                } else {
                    if (grid[i][j] > 0) {
                        dp[0][i][j] = Math.max(grid[i][j] * dp[0][i - 1][j], grid[i][j] * dp[0][i][j - 1]);
                        dp[1][i][j] = Math.min(grid[i][j] * dp[1][i - 1][j], grid[i][j] * dp[1][i][j - 1]);
                    } else {
                        dp[0][i][j] = Math.max(grid[i][j] * dp[1][i - 1][j], grid[i][j] * dp[1][i][j - 1]);
                        dp[1][i][j] = Math.min(grid[i][j] * dp[0][i - 1][j], grid[i][j] * dp[0][i][j - 1]);
                    }
                }
//                System.out.println(String.format("i=%s, j=%s", i, j));
//                Utils.print(dp[0]);
//                System.out.println("--------");
//                Utils.print(dp[1]);
//                System.out.println("*****************************");
            }
        }

        double max = Math.max(dp[0][m - 1][n - 1], dp[1][m - 1][n - 1]);


        return max > 0 ? (int)(max % 1000000007) : -1;
    }

    public static void main(String[] args) {
//        int arr [][] =  {{1,-2,1},
//             {1,-2,1},
//             {3,-4,1}};

//        int arr[][] = {{1,3}, {0, -4}};

//        int arr[][] = {{2, 1, 3, 0, -3, 3, -4, 4, 0, -4},
//                {-4, -3, 2, 2, 3, -3, 1, -1, 1, -2},
//                {-2, 0, -4, 2, 4, -3, -4, -1, 3, 4},
//                {-1, 0, 1, 0, -3, 3, -2, -3, 1, 0},
//                {0, -1, -2, 0, -3, -4, 0, 3, -2, -2},
//                {-4, -2, 0, -1, 0, -3, 0, 4, 0, -3},
//                {-3, -4, 2, 1, 0, -4, 2, -4, -1, -3},
//                {3, -2, 0, -4, 1, 0, 1, -3, -1, -1},
//                {3, -4, 0, 2, 0, -2, 2, -4, -2, 4},
//                {0, 4, 0, -3, -4, 3, 3, -1, -2, -2}};

        int arr[][] = {{1, -1, 2, 1, -1, 0, 0, 4, 3, 2, 0, -2, -2},
                {-2, 3, 3, -1, -1, 0, 0, -2, 4, -3, 3, 0, 0},
                {-4, -1, -1, -2, 2, -1, -2, -2, 0, 3, -1, -4, 1},
                {-3, 4, -3, 0, -3, 1, -3, 1, 4, 4, -4, -4, -2},
                {3, -3, 1, 0, -1, -4, -4, -4, 3, 2, 2, 3, 3},
                {2, -1, -1, -4, -3, -3, 4, 2, 3, 4, 4, -4, 0},
                {4, -1, 2, -3, -1, -1, -3, -4, 4, 4, 4, -3, -1},
                {-3, -4, 4, -2, -1, 2, 3, -1, 2, 3, 4, 4, -4},
                {-3, -1, -2, 1, 1, -1, -3, -4, -3, 1, -3, 3, -4},
                {2, 4, 4, 4, -3, -3, 1, -1, 3, 4, -1, 1, 4},
                {2, -2, 0, 4, -1, 0, -2, 4, -4, 0, 0, 2, -3},
                {1, 1, -3, 0, -4, -4, -4, -4, 0, -1, -4, -1, 0},
                {3, -1, -3, -3, -3, -2, -1, 4, -1, -2, 4, 2, 3}};

        System.out.println(new MaxProductPath5521().maxProductPath(arr));
    }
}
