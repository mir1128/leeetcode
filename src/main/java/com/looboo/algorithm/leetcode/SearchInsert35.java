package com.looboo.algorithm.leetcode;

public class SearchInsert35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        if (target > nums[nums.length - 1]) return nums.length;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
