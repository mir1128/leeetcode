package com.looboo.algorithm.leetcode;

public class MinSubArrayLen209 {
    public int minSubArrayLen1(int s, int[] nums) {
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


    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = -1;

        int sum = 0;
        int minLength = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            right = i;
            sum += nums[right];

            while (sum >= s) {
                if (minLength > right - left + 1) {
                    minLength = right - left + 1;
                }
                sum -= nums[left];
                left += 1;
            }
        }

        if (minLength > nums.length) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};

        System.out.println(new MinSubArrayLen209().minSubArrayLen(7, arr));
        System.out.println(new MinSubArrayLen209().minSubArrayLen1(7, arr));
    }
}
