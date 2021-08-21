package com.looboo.algorithm.leetcode;

public class FixedPoint1064 {
    public int fixedPoint(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i) return i;
        }
        return -1;
    }
}
