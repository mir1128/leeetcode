package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {

        if (nums.length == 3) {
            if (2* nums[1] == nums[0] + nums[2]) {
                swap(nums, 0, 1);
                return nums;
            }
            return nums;
        }

        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == ( 2* nums[i - 1] - nums[i - 2])) {
                if (i + 1 < nums.length) {
                    swap(nums, i, i + 1);
                } else {
                    swap(nums, i, 0);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
