package com.looboo.algorithm.luogu.listunknown;

import java.util.Scanner;

public class P1226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int mod = scanner.nextInt();
        long result = fastPower(a, b, mod);
        System.out.printf("%s^%s mod %s=%s%n", a, b, mod, result);
    }

    public static long fastPower(long a, long b, long mod) {
        long base = a;
        long ret = 1;
        while (b != 0) {
            if ((b & 1) == 1) ret = (ret * base) % mod;
            b = b >> 1;
            base *= base;
            base %= mod;
        }
        return ret;
    }
}
