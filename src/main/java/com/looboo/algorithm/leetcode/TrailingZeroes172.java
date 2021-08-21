package com.looboo.algorithm.leetcode;

public class TrailingZeroes172 {
    public int trailingZeroes(int n) {
        int sum = 0;
        if (n % 10 >= 5) {
            sum += 1;
        }

        n /= 10;
        while (n != 0) {
            sum += 2;
            n /= 10;
        }

        return sum;
    }
}
