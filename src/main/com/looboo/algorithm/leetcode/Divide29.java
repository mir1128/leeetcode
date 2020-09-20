package com.looboo.algorithm.leetcode;

public class Divide29 {
    public int divide(int dividend, int divisor) {

        if (dividend == 0) return 0;

        int n = 0;
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) return Integer.MAX_VALUE;
            if (divisor == 1) return Integer.MIN_VALUE;

            if (divisor < 0) {
                dividend -= divisor;
            } else {
                dividend += divisor;
            }
            ++n;
        }

        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);


        while (dividend > 0) {
            dividend -= divisor;
            if (dividend < 0) break;
            ++n;
        }

        return isNegative ? -n : n;
    }

    public static void main(String[] args) {
        System.out.println(new Divide29().divide(-2147483648, 2));
    }
}
