package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class SpecialArray {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            int y = i;
            if (IntStream.of(nums).filter(x -> x >= y).count() == y) {
                return y;
            }
        }
        return -1;
    }
}
