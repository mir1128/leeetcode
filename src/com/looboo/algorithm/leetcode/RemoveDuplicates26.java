package com.looboo.algorithm.leetcode;

public class RemoveDuplicates26 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[k]) {
                continue;
            } else {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
