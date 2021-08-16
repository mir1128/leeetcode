package com.looboo.algorithm.luogu.list02;

import java.util.Arrays;
import java.util.Scanner;

public class P1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] votes = new int[m];
        for (int i = 0; i < m; i++) {
            votes[i] = scanner.nextInt();
        }

        solve(votes, m);
    }

    public static void solve(int[] votes, int m) {
        Arrays.sort(votes, 0, m);

        System.out.print(votes[0]);
        for (int i = 1; i < m; i++) {
            System.out.printf(" %s", votes[i]);
        }
    }
}
