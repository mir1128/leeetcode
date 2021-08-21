package com.looboo.algorithm.leetcode;

public class LongestMountain845 {
    public int longestMountain(int[] A) {
        if (A.length < 3) return 0;

        int max = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                int j = i - 1;
                while (j >= 1 && A[j] > A[j - 1]) --j;

                int k = i + 1;
                while (k < A.length - 1 && A[k] > A[k+1]) k++;

                max = Math.max(k - j + 1, max);
            }
        }
        return max;
    }
}
