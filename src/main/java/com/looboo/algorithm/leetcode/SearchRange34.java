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

    public int[] searchRange1(int[] nums, int target) {
        int[] res = {-1, -1};

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) {
            res[0] = left;
        } else {
            return res;
        }

        left = 0;
        right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        res[1] = left;
        return res;
    }
}
