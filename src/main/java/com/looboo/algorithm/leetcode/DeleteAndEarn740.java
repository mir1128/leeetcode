package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class DeleteAndEarn740 {
    public int deleteAndEarn(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {

            int j = i - 1;
            int sum = 0;
            while (j >= 0 && nums[j] == nums[i]) {
                sum += nums[j];
                --j;
            }
            while ((j >= 0) && (nums[j] == nums[i] - 1)) --j;

            if (j >= 0) {
                dp[i] = Math.max(nums[i] + dp[j] + sum, dp[i - 1]);
            } else {
                dp[i] = Math.max(dp[i - 1], nums[i] + sum);
            }
        }
        return dp[nums.length - 1];
    }
}
