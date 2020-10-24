package com.looboo.algorithm.leetcode;

public class Tribonacci1137 {
    public int tribonacci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int s1 = 1;
        int s2 = 1;
        int s3 = 2;
        for (int i = 4; i <= n; i++) {
            int temp = s1 + s2 + s3;
            s1 = s2;
            s2 = s3;
            s3 = temp;
        }
        return s3;
    }
}
