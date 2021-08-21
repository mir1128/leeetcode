package com.looboo.algorithm.leetcode;

public class NumWays276 {
    public int numWays(int n, int k) {

        int s1 = k;
        int s2 = k * k;
        if (n == 0) return 0;
        if (n == 1) return s1;
        if (n == 2) return s2;

        for (int i = 3; i <= n; i++) {
            int a = s1 * (k - 1) + s2 * (k - 1);
            s1 = s2;
            s2 = a;
        }
        return s2;
    }
}
