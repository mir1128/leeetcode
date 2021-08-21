package com.looboo.algorithm.leetcode;

public class GetMaxMatrix17_24 {
    public int[] getMaxMatrix(int[][] matrix) {

        int[][] total = total(matrix);

        Utils.print(total);

        int m = matrix.length;
        int n = matrix[0].length;

        int[] res = new int[4];
        int max = total[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (total[i][j] > max) {
                    max = total[i][j];
                    res = new int[]{0, 0, i, j};
                    print(max, res);
                }

                for (int k = 0; k <= i; k++) {
                    for (int l = 0; l <= j; l++) {
                        if (k == i && l == j) {
                            continue;
                        } else if (k != i && l == j) {
                            if (total[i][j] - total[k][j] > max) {
                                max = total[i][j] - total[k][j];
                                res = new int[]{k + 1, 0, i, j};
                                print(max, res);
                            }
                        } else if (k == i && l != j) {
                            if (total[i][j] - total[i][l] > max) {
                                max = total[i][j] - total[i][l];
                                res = new int[]{0, l + 1, i, j};
                                print(max, res);
                            }
                        } else {
                            if (total[i][j] + total[k][l] - total[i][l] - total[k][j] > max) {
                                max = total[i][j] + total[k][l] - total[i][l] - total[k][j];
                                res = new int[]{k + 1, l + 1, i, j};
                                print(max, res);
                            }
                        }
                    }
                }
            }
        }

        return res;
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

    private void print(int max, int[] res) {
        System.out.println(String.format("max: %s, (%s, %s), (%s, %s)", max, res[0], res[1], res[2], res[3]));
    }
}
