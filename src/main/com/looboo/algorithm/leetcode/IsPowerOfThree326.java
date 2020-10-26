package com.looboo.algorithm.leetcode;

public class IsPowerOfThree326 {
    public boolean isPowerOfThree(int n) {
        while (n >=3) {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return 1== n;
    }
}
