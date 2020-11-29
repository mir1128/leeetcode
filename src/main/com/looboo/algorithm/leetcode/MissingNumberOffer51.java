package com.looboo.algorithm.leetcode;

public class MissingNumberOffer51 {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[left] == left) {
            return left + 1;
        } else {
            return left;
        }
    }
}
