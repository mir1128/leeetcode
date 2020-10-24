package com.looboo.algorithm.leetcode;

public class Maximum16_07 {
    public int maximum(int a, int b) {

        long x = (long) a - (long) b;
        int k = (int) (x >> 63);

        return (1 + k) * a - b * k;

    }
}
