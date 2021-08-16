package com.looboo.algorithm.luogu.list01;

import java.util.Scanner;

public class P1601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = solve(scanner);

        System.out.println(result);
    }

    public static String trim(String result) {

        int i = 0;
        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }

        if (i == result.length()) return "0";

        return result.substring(i);
    }

    public static String solve(Scanner scanner) {
        String first = scanner.next();
        String second = scanner.next();

        int c = 0;

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= Math.max(first.length(), second.length()); i++) {
            int a1 = 0;
            int a2 = 0;
            if (i <= first.length()) {
                a1 = first.charAt(first.length() - i) - '0';
            } else {
                a1 = 0;
            }

            if (i <= second.length()) {
                a2 = second.charAt(second.length() - i) - '0';
            } else {
                a2 = 0;
            }

            int res = a1 + a2 + c;
            if (res >= 10) {
                c = 1;
                res -= 10;
            } else {
                c = 0;
            }

            result.insert(0, res);
        }
        if (c == 1) {
            result.insert(0, 1);
        }
        return trim(result.toString());
    }
}
