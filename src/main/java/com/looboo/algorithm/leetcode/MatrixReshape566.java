package com.looboo.algorithm.leetcode;

public class MatrixReshape566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int m = nums.length;
        int n = nums[0].length;

        if (r * c != m * n) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int p = i * c + j;
                res[i][j] = nums[p / n][p % n];
            }
        }

        return res;
    }
}
