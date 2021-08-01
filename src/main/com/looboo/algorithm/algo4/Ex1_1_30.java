package com.looboo.algorithm.algo4;

import com.looboo.algorithm.leetcode.Utils;
import com.looboo.algorithm.lib.GCD;

public class Ex1_1_30 {
    public static boolean[][] gcdMatrix(int N) {
        boolean[][] result = new boolean[N][N];

        GCD gcd = new GCD();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (gcd.euclid(Math.max(i, j), Math.min(i, j)) == 1) {
                    result[i][j] = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Utils.print(Ex1_1_30.gcdMatrix(10));
    }
}
