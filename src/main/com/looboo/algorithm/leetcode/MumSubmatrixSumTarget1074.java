package com.looboo.algorithm.leetcode;

public class MumSubmatrixSumTarget1074 {

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        return atMost(matrix, target) - atMost(matrix, target-1);
    }

    private int atMost(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int count = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k < n; k++) {
                    if (sum + matrix[i][j] <= target) {
                        sum += matrix[i][j];
                        count++;
                    } else {
                        sum = matrix[i][j];
                    }
                }       
            }
        }
        return count;
    }
}
