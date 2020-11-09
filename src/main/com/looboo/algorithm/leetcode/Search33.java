package com.looboo.algorithm.leetcode;

public class Search33 {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else {
                if (nums[mid + 1] > nums[mid]) {
                    if (target > nums[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        if (nums[left] == target) return target;
        return -1;
    }
}
