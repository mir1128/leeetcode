package com.looboo.algorithm.leetcode;

public class SearchRange34 {
    public int[] searchRange(int[] nums, int target) {

        int[] res = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i - 1] != target) && nums[i] == target) {
                res[0] = i;
            }
            if (nums[i] == target && (i == nums.length - 1 || nums[i + 1] != target)) {
                res[1] = i;
            }
        }
        return res;
    }
}
