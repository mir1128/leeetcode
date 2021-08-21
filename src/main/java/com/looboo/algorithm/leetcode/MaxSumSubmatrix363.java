package com.looboo.algorithm.leetcode;

public class MaxSumSubmatrix363 {
    public int maxSumSubmatrix(int[][] matrix, int k) {

        int[][] total = total(matrix);

        return atMost(total, k);
    }

    private int[][] total(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] total = new int[m][n];

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
                total[i][j] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += total[j][i];
                total[j][i] = sum;
            }
        }

        return total;
    }

    private int atMost(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int res = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (res > k || (res <= k && matrix[i][j] <= k && (k - res > k - matrix[i][j]))) {
                    res = matrix[i][j];
                }

                for (int l = 0; l <= i; l++) {
                    for (int o = 0; o <= j; o++) {

                        int tmp = 0;
                        if (i == l && o == j) {
                            tmp = matrix[i][j];
                        } else if (i != l && o == j ) {
                            tmp = matrix[i][j] - matrix[l][o];
                        } else if (i ==l && o != j) {
                            tmp = matrix[i][j] - matrix[l][o];
                        } else {
                            tmp = matrix[i][j] + matrix[l][o] - matrix[i][o] - matrix[l][j];
                        }

                        if (res > k || (res <= k && tmp <= k && (k - res > k - tmp))) {
                            res = tmp;
                        }
                    }
                }
            }
        }

        return res;
    }
}
