package com.looboo.algorithm.leetcode;

public class IsPowerOfFour342 {
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && (num % 3 == 1);
    }
}
