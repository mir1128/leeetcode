package com.looboo.algorithm.leetcode;

public class NumMatrix304 {

    private int[][] sum;

    public NumMatrix304(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) return;

        int col = matrix[0].length;
        if (col == 0) return;
        sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            int total = 0;
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    total += matrix[i][j];
                    sum[i][j] = total;
                } else {
                    total += matrix[i][j];
                    sum[i][j] = sum[i - 1][j] + total;
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (sum == null) return 0;

        return sum[row2][col2] + (row1 > 0 && col1 > 0 ? sum[row1-1][col1-1] : 0)
                - (row1 > 0 ? sum[row1 - 1][col2] : 0)
                - (col1 > 0 ? sum[row2][col1 - 1] : 0);
    }
}
