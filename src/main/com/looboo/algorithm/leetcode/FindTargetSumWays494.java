package com.looboo.algorithm.leetcode;

public class FindTargetSumWays494 {
    public int findTargetSumWays(int[] nums, int S) {

        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }

        int total = 0;
        int n = (int) Math.pow(2, nums.length);
        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(i);
            String binaryString = new String(new char[nums.length-s.length()]).replace("\0", "0") + s;

            int tmp = sum;
            for (int j = 0; j < binaryString.length(); j++) {
                if (binaryString.charAt(j) == '1') {
                    tmp -= 2 * nums[j];
                }
            }
            if (tmp == S) {
                total++;
            }
        }

        return total;
    }
}
