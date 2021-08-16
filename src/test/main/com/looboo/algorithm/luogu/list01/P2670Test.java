package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.util.Scanner;

import static com.looboo.algorithm.luogu.list01.P2670.print;
import static org.junit.Assert.*;

public class P2670Test {
    @Test
    public void test01() {
        String chars = "3 3\n" +
                "*??\n" +
                "???\n" +
                "?*?\n";

        Scanner scanner = new Scanner(chars);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] input = new char[n][];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.next().toCharArray();
        }


        int[][] solve = P2670.solve(input, n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] == '*') {
                    System.out.print("*");
                } else {
                    System.out.print(solve[i][j]);
                }
            }
            System.out.println("");
        }
    }

    @Test
    public void test02() {

        String chars = "2 3\n" +
                "?*?\n" +
                "*??\n";

        Scanner scanner = new Scanner(chars);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] input = new char[n][];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.next().toCharArray();
        }

        int[][] solve = P2670.solve(input, n, m);

        print(n, m, input, solve);
    }
}