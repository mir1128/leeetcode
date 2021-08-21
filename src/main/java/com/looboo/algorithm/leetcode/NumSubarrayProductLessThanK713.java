package com.looboo.algorithm.leetcode;

public class NumSubarrayProductLessThanK713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int[] prefix = new int[nums.length + 1];
        prefix[0] = 1;

        int total = 1;
        int left = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] * nums[i];

            total = prefix[i + 1] / prefix[left];
            while (total >= k && left < i + 1) {
                ++left;
                total /= prefix[left];
            }

            if (total < k) {
                System.out.println(String.format("i = %s, nums[i] = %s, left = %s, nums[left] = %s", i, nums[i], left, nums[left]));
                n += i + 1 - left;
                System.out.println("n = " +  n);
            }
        }
        return n;
    }
}
