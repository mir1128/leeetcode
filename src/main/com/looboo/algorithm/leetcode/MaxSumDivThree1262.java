package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class MaxSumDivThree1262 {
//    public int maxSumDivThree(int[] nums) {
//        int[][] dp = new int[2][3];
//        dp[0][nums[0] % 3] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] % 3 == 0) {
//                dp[i % 2][0] = dp[(i - 1) % 2][0] + nums[i];
//                dp[i % 2][1] = dp[(i - 1) % 2][1] == 0 ? 0 : dp[(i - 1) % 2][1] + nums[i];
//                dp[i % 2][2] = dp[(i - 1) % 2][2] == 0 ? 0 : dp[(i - 1) % 2][2] + nums[i];
//            } else if (nums[i] % 3 == 1) {
//                dp[i % 2][0] = dp[(i - 1) % 2][2] == 0 ? dp[(i - 1) % 2][0] : max(dp[(i - 1) % 2][2] + nums[i], dp[(i - 1) % 2][0]);
//                dp[i % 2][1] = max(dp[(i - 1) % 2][0] + nums[i], dp[(i - 1) % 2][1]);
//                dp[i % 2][2] = dp[(i - 1) % 2][1] == 0 ? dp[(i - 1) % 2][2] : max(dp[(i - 1) % 2][1] + nums[i], dp[(i - 1) % 2][2]);
//            } else {
//                dp[i % 2][0] = dp[(i - 1) % 2][1] == 0 ? dp[(i - 1) % 2][0] : max(dp[(i - 1) % 2][1] + nums[i], dp[(i - 1) % 2][0]);
//                dp[i % 2][1] = dp[(i - 1) % 2][2] == 0 ? dp[(i - 1) % 2][1] : max(dp[(i - 1) % 2][2] + nums[i], dp[(i - 1) % 2][1]);
//                dp[i % 2][2] = max(dp[(i - 1) % 2][0] + nums[i], dp[(i - 1) % 2][2]);
//            }
//            Utils.print(dp[i % 2]);
//        }
//
//        return dp[(nums.length - 1) % 2][0];
//    }

    public int maxSumDivThree(int[] nums) {
        int[] dp = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                dp[0] = dp[0] + nums[i];
                dp[1] = dp[1] + nums[i];
                dp[2] = dp[2] + nums[i];
            } else if (nums[i] % 3 == 1) {
                int a = Math.max(dp[2] + nums[i], dp[0]);
                int b = Math.max(dp[0] + nums[i], dp[1]);
                int c = Math.max(dp[1] + nums[i], dp[2]);
                dp = new int[]{a, b, c};
            } else {
                int a = Math.max(dp[1] + nums[i], dp[0]);
                int b = Math.max(dp[2] + nums[i], dp[1]);
                int c = Math.max(dp[0] + nums[i], dp[2]);
                dp = new int[]{a, b, c};
            }
            Utils.print(dp);
        }
        return dp[0];
    }

    private int max(int... arr) {
        return IntStream.of(arr).max().getAsInt();
    }

}
