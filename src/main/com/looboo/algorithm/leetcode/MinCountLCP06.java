package com.looboo.algorithm.leetcode;

public class MinCountLCP06 {
    public int minCount(int[] coins) {
        int res = 0;
        for (int i = 0; i < coins.length; i++) {
            res += coins[i] / 2 + coins[i] % 2;
        }
        return res;
    }
}
