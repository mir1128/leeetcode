package com.looboo.algorithm.leetcode;

public class FindTargetSumWays494 {
//    public int findTargetSumWays(int[] nums, int S) {
//
//        int[] arr = new int[nums.length];
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            arr[i] = sum;
//        }
//
//        int total = 0;
//        int n = (int) Math.pow(2, nums.length);
//        for (int i = 0; i < n; i++) {
//            String s = Integer.toBinaryString(i);
//            String binaryString = new String(new char[nums.length-s.length()]).replace("\0", "0") + s;
//
//            int tmp = sum;
//            for (int j = 0; j < binaryString.length(); j++) {
//                if (binaryString.charAt(j) == '1') {
//                    tmp -= 2 * nums[j];
//                }
//            }
//            if (tmp == S) {
//                total++;
//            }
//        }
//
//        return total;
//    }

    public int findTargetSumWays(int[] nums, int S) {

        int[][] dp = new int[nums.length][2001];

        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] += 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < 2001; j++) {
                if (dp[i - 1][j] > 0) {
                    if (j + nums[i] >= 0 && j + nums[i] < 2001) {
                        dp[i][j + nums[i]] += dp[i - 1][j];
                    }
                    if (j - nums[i] >= 0 && j - nums[i] < 2001) {
                        dp[i][j - nums[i]] += dp[i - 1][j];
                    }
                }
            }
        }

        return dp[nums.length - 1][S + 1000];
    }
}
