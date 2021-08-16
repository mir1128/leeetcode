package com.looboo.algorithm.luogu.list01;

import java.util.Scanner;

public class P4924 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] result = solve(scanner);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i][0]);
            for (int j = 1; j < result[0].length; j++) {
                System.out.print(" " + result[i][j]);
            }
            System.out.println("");
        }
    }

    private static int[][] solve(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] operations = new int[m][4];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 4; j++) {
                operations[i][j] = scanner.nextInt();
            }
        }
        return rotate(n, m, operations);
    }

    private static int[][] rotate(int n, int m, int[][] operations) {

        int[][] matrix = new int[n][n];
        for (int i = 1; i <= n * n; i++) {
            int row = (i - 1) / n;
            int col = (i - 1) % n;
            matrix[row][col] = i;
        }

        for (int i = 0; i < m; i++) {
            rotate(matrix, operations[i]);
//            Utils.print(matrix);
        }
        return matrix;
    }

    private static int[][] rotate(int[][] matrix, int[] operation) {

        int width = operation[2];
        int[][] temp = new int[2 * width + 1][2 * width + 1];

        int row = operation[0] - 1;
        int col = operation[1] - 1;

        if (operation[3] == 0) {
            for (int i = row - width; i <= row + width; i++) {
                for (int j = col - width; j <= col + width; j++) {
                    int r = i - (row - width);
                    int c = j - (col - width);

//                    System.out.println("clock direction");
//                    System.out.println(String.format("%s, %s, %s, %s", i, j, c, 2 * width - r));
                    temp[c][2 * width - r] = matrix[i][j];
                }
            }
        } else {
            for (int i = row - width; i <= row + width; i++) {
                for (int j = col - width; j <= col + width; j++) {
                    int r = i - (row - width);
                    int c = j - (col - width);

//                    System.out.println("ant-clock direction");
//                    System.out.println(String.format("%s, %s, %s, %s", i, j, 2 * width - c, r));
                    temp[2 * width - c][r] = matrix[i][j];
                }
            }
        }

        for (int i = row - width; i <= row + width; i++) {
            for (int j = col - width; j <= col + width; j++) {
                int r = i - (row - width);
                int c = j - (col - width);
                matrix[i][j] = temp[r][c];
            }
        }

        return matrix;
    }
}
