package com.looboo.algorithm.leetcode;

public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;

        if (m == 0) return 0;

        int n = grid[0].length;

        if (n == 0) return 0;

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    sum += edges(grid, i, j);
                }
            }
        }

        return sum;
    }

    private int edges(int[][] grid, int i, int j) {
        int sum = 0;
        int m = grid.length;
        int n = grid[0].length;
        if (i - 1 < 0 || grid[i - 1][j] == 0) sum += 1;
        if (j - 1 < 0 || grid[i][j - 1] == 0) sum += 1;
        if (i + 1 >= m || grid[i + 1][j] == 0) sum += 1;
        if (j + 1 >= n || grid[i][j + 1] == 0) sum += 1;
        return sum;
    }
}
