package com.looboo.algorithm.leetcode;

public class NumberOfArithmeticSlices413 {
    public int numberOfArithmeticSlices(int[] nums) {

        int n = nums.length;
        if (n < 3) return 0;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        int prev = 2;
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                prev += 1;
            } else {
                prev = 2;
            }

            dp[i] = prev;
            result += dp[i] > 2 ? dp[i] - 2 : 0;
        }

        Utils.print(dp);

        return result;
    }
}
