package com.looboo.algorithm.leetcode;

public class MinSubArrayLen209 {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = -1;

        int result = nums.length + 1;
        int sum = 0;
        while (left < nums.length) {
            if (sum < s && right + 1 < nums.length) {
                sum += nums[++right];
            } else {
                sum -= nums[left++];
            }

            if (sum >= s) {
                result = Math.min(right - left + 1, result);
            }
        }

        if (result == nums.length + 1) return 0;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};

        new MinSubArrayLen209().minSubArrayLen(7, arr);
    }
}
