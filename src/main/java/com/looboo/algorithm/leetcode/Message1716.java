package com.looboo.algorithm.leetcode;

public class Message1716 {
    public int massage(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int total[] = new int[n];
        total[0] = nums[0];
        total[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; ++i) {
            total[i] = Math.max(total[i - 1], total[i - 2] + nums[i]);
        }

        return total[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 5, 3, 1, 1, 3};
        System.out.println(new Message1716().massage(arr));
    }
}
