package com.looboo.algorithm.luogu.list01;

import java.util.Scanner;

public class P1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = solve(scanner);

        System.out.println(result);
    }

    public static String solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] coef = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            coef[i] = scanner.nextInt();
        }

        StringBuilder stringBuilder = new StringBuilder();

        if (coef[0] != 1 && coef[0] != -1) {
            stringBuilder.append(coef[0]);
        } else {
            if (coef[0] == -1) stringBuilder.append('-');
        }

        stringBuilder.append('x');

        if (n != 1) {
            stringBuilder.append('^').append(n);
        }

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                if (coef[i] > 0) stringBuilder.append('+').append(coef[i]);
                else if (coef[i] < 0) stringBuilder.append(coef[i]);
            } else {
                if (coef[i] > 0) {
                    stringBuilder.append('+');
                    if (coef[i] != 1) {
                        stringBuilder.append(coef[i]);
                    }
                    stringBuilder.append('x');
                    if (i != n - 1) {
                        stringBuilder.append('^').append(n - i);
                    }
                } else if (coef[i] < 0) {
                    if (coef[i] == -1) {
                        stringBuilder.append('-');
                    } else {
                        stringBuilder.append(coef[i]);
                    }
                    stringBuilder.append('x');
                    if (i != n - 1) {
                        stringBuilder.append('^').append(n - i);
                    }
                }
            }
        }

        return stringBuilder.toString();
    }
}
