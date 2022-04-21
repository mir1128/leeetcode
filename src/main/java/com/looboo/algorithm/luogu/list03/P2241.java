package com.looboo.algorithm.luogu.list03;

import java.util.Scanner;

public class P2241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
//
//        long rect = 0;
//        long square = 0;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                square += Math.min(i, j);
//                rect += (long) i * j;
//            }
//        }
//        System.out.printf("%s %s%n", square, rect - square);
        solve(n, m);
    }

    public static void solve(int m, int n) {
        long square = 0;
        for (int i = 1; i <= Math.min(m, n); i++) {
            square += (long) (n - i + 1) * (m - i + 1);
        }

        long rect = (long) n * (n + 1) * m * (m + 1) / 4 - square;

        System.out.printf("%s %s%n", square, rect);
    }
}
