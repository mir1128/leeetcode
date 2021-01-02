package com.looboo.algorithm.leetcode;

public class TwoSumLessThanK1099 {
    public int twoSumLessThanK(int[] nums, int k) {

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] < k) {
                    res = Math.max(res, nums[i] + nums[j]);
                }
            }
        }
        return res;
    }
}
