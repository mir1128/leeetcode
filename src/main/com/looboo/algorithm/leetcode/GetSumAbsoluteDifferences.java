package com.looboo.algorithm.leetcode;

public class GetSumAbsoluteDifferences {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int[] pre = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pre[i] = sum;
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int a1 = (i+1) * nums[i] - pre[i];
            int a2 = pre[nums.length-1] - pre[i] - (nums.length-1-i) * nums[i];

            res[i] = a1 + a2;
        }

        return res;
    }
}
