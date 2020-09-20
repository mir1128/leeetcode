package com.looboo.algorithm.leetcode;

public class MaxSubArrayOffer42 {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int sum[] = new int[n];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[1], nums[0] + nums[1]);

        int max = Math.max(sum[0], sum[1]);
        for (int i = 2; i < n; ++i) {
            if (sum[i - 1] >= 0) {
                sum[i] = sum[i - 1] + nums[i];
            } else {
                sum[i] = nums[i];
            }
            if (sum[i] > max) max = sum[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSubArrayOffer42().maxSubArray(arr));
    }
}
