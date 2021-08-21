package com.looboo.algorithm.template;

//快速幂
public class FastPower {

    //a ^ b
    public static int fastPower1(int a, int b) {
        int ret = 1;
        int base = a;
        while (b != 0) {
            if (b % 2 == 1) ret *= base;
            base *= base;
            b /= 2;
        }
        return ret;
    }

    public static int fastPower2(int a, int b) {
        int ret = 1;
        int base = a;
        while (b != 0) {
            if ((b & 1) == 1) ret *= base;
            base *= base;
            b = b >> 1;
        }
        return ret;
    }

    public static int fastPowerWithMod(int a, int b, int mod) {
        int ret = 1;
        int base = a;
        while (b != 0) {
            if (b % 2 == 1) {
                ret *= base;
                ret %= mod;
            }
            b /= 2;
            base *= base;
            base %= mod;
        }
        return ret;
    }
}
