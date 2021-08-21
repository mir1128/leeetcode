package com.looboo.algorithm.luogu.list01;


import java.util.Scanner;

public class P2670 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] input = new char[n][];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.next().toCharArray();
        }

        int[][] result = solve(input, n, m);

        print(n, m, input, result);
    }

    public static void print(int n, int m, char[][] input, int[][] result) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] == '*') {
                    System.out.print("*");
                } else {
                    System.out.print(result[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public static int[][] solve(char[][] input, int n, int m) {
        int[][] result = new int[n][m];

        int[][] neighbors = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] == '*') {
                    for (int k = 0; k < neighbors.length; k++) {
                        if (neighbors[k][0] + i >= 0 && neighbors[k][0] + i < n
                                && neighbors[k][1] + j >= 0 && neighbors[k][1] + j < m) {
                            result[neighbors[k][0] + i][neighbors[k][1] + j] += 1;
                        }
                    }
                }
            }
        }

        return result;
    }
}
