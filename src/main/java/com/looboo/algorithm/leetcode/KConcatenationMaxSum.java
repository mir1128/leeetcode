package com.looboo.algorithm.leetcode;

public class KConcatenationMaxSum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        if (k == 1 || k == 2) {
            return maxSum(arr, k);
        } else {
            int maxSum2 = maxSum(arr, 2);

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            if (sum >0) {
                return Math.max(sum * (k-1) + maxSum(arr, 1), maxSum2);
            } else {
                return maxSum2;
            }
        }
    }

    private int maxSum(int arr[], int k) {
        int sum = 0;
        int max = 0;

        while (k >= 1) {
            for (int i = 0; i < arr.length; i++) {
                sum = Math.max((sum + arr[i]) % (1000000007), arr[i]);
                max = Math.max(max, sum);
            }
            k--;
        }

        return max;
    }
}
