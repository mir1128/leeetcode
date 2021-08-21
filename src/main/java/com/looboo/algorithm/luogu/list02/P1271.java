package com.looboo.algorithm.luogu.list02;

import java.util.Scanner;

public class P1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] votes = new int[1000];

        for (int i = 0; i < m; i++) {
            votes[scanner.nextInt()]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            if (votes[i] != 0) {
                for (int j = 0; j < votes[i]; j++) {
                    sb.append(i).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
