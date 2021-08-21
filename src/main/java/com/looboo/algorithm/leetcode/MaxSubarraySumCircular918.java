package com.looboo.algorithm.leetcode;

public class MaxSubarraySumCircular918 {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0;
        int maxSum = 0;
        int minSum = 0;
        int max = A[0];
        int min = A[0];
        for (int i = 0; i < A.length; i++) {
            maxSum = Math.max(maxSum + A[i], A[i]);
            max = Math.max(maxSum, max);

            minSum = Math.min(minSum + A[i], A[i]);
            min = Math.min(min, minSum);
            total += A[i];
        }

        return max > 0 ? Math.max(max, total - min) : max;
    }

}
