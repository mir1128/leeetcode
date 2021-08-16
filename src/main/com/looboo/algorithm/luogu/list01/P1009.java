package com.looboo.algorithm.luogu.list01;

import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String result = solve(n);

        System.out.println(result);
    }

    public static String solve(int n) {
        String factorial = "1";
        String result = "0";

        for (int i = 1; i <= n; i++) {
            factorial = mul(factorial, i);
            result = add(result, factorial);
        }
        return result;
    }

    private static String mul(String n1, int num) {
        int c = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n1.length(); i++) {
            int temp = (n1.charAt(n1.length() - i) - '0') * num + c;
            c = temp / 10;
            stringBuilder.insert(0, temp % 10);
        }
        if (c != 0) {
            stringBuilder.insert(0, c);
        }

        int i = 0;
        while (i < stringBuilder.length() && stringBuilder.charAt(i) == '0') {
            i++;
        }
        if (i == stringBuilder.length()) return "0";
        return stringBuilder.substring(i);
    }


    public static String add(String n1, String n2) {

        int c = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= Math.max(n1.length(), n2.length()); i++) {
            int a1 = i <= n1.length() ? n1.charAt(n1.length() - i) - '0' : 0;
            int a2 = i <= n2.length() ? n2.charAt(n2.length() - i) - '0' : 0;

            int res = a1 + a2 + c;
            if (res >= 10) {
                res -= 10;
                c = 1;
            } else {
                c = 0;
            }
            stringBuilder.insert(0, res);
        }
        if (c == 1) stringBuilder.insert(0, 1);

        int i = 0;
        while (i < stringBuilder.length() && stringBuilder.charAt(i) == '0') {
            ++i;
        }

        return i == stringBuilder.length() ? "0" : stringBuilder.substring(i);
    }
}
