package com.looboo.algorithm.leetcode;

public class MinimumMountainRemovals {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < i; j += 1) {
                if (nums[i] > nums[j]) {
                    pre[i] = Math.max(pre[j], pre[i]);
                }
            }
            pre[i] += 1;
        }
        for (int i = n - 1; i >= 0; i -= 1) {
            for (int j = n - 1; j > i; j -= 1) {
                if (nums[i] > nums[j]) {
                    suf[i] = Math.max(suf[j], suf[i]);
                }
            }
            suf[i] += 1;
        }

        int res = 0;
        for (int i = 0; i < n; i += 1) {
            if (pre[i] >= 2 && suf[i] >= 2) {
                res = Math.max(res, pre[i] + suf[i] - 1);
            }
        }
        return n - res;
    }


}
