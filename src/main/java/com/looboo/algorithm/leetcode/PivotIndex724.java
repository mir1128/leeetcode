package com.looboo.algorithm.leetcode;

public class PivotIndex724 {
    public int pivotIndex(int[] nums) {

        int[] prefix = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        for (int i = 1; i < prefix.length - 2; i++) {
            int i1 = prefix[prefix.length - 1] - prefix[i];
            if (prefix[i-1] == i1) {
                return i;
            } else if (prefix[i-1] > i1) {
                return -1;
            }
        }

        return -1;
    }
}
