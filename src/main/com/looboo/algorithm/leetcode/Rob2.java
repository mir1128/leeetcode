package com.looboo.algorithm.leetcode;

public class Rob2 {
    public int rob(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        return Math.max(
                robMax(nums, 0, nums.length - 1),
                robMax(nums, 1, nums.length)
                );
    }

    //[from, to)
    private int robMax(int[] nums, int from, int to) {

        if (to - from == 0) return 0;
        if (to - from == 1) return nums[from];
        if (to - from == 2) return Math.max(nums[from + 1], nums[from]);

        int s1 = nums[from];
        int s2 = Math.max(nums[from], nums[from+1]);
        for (int i = from + 2; i < to; i++) {
            int tmp = Math.max(s1 + nums[i], s2);
            s1 = s2;
            s2 = tmp;
        }
        return s2;
    }
}
