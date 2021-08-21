package com.looboo.algorithm.leetcode;

public class FibOffer {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int s1 = 1;
        int s2 = 2;
        for (int i = 4; i <= n; i++) {
            int temp = (s1 + s2) % (1000000007);
            s1 = s2;
            s2 = temp;
        }
        return s2;
    }
}
