package com.looboo.algorithm.leetcode;

public class IsThree {
    public boolean isThree(int n) {
        int sqrt = (int)Math.sqrt(n);
        if (sqrt * sqrt == n) {
            for (int i = 2; i < sqrt; i++) {
                if (sqrt % i == 0) return false;
            }
            return true;
        }
        return false;
    }
}
