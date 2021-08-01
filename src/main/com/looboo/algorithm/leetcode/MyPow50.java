package com.looboo.algorithm.leetcode;

public class MyPow50 {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -n);
        double mid = myPow(x, n / 2);
        if ((n & 1) != 0)
            return mid * mid * x;
        return mid * mid;
    }
}
