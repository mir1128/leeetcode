package com.looboo.algorithm.leetcode;

public class NumberOfMatches {
    public int numberOfMatches(int n) {
        int m = n;
        int count = 0;
        while (m != 1) {
            if (m % 2 == 0) {
                count += m / 2;
                m = m / 2;
            } else {
                count += (m - 1) / 2;
                m = (m - 1) / 2 + 1;
            }
        }
        return count;
    }
}

