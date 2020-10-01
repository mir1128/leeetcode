package com.looboo.algorithm.leetcode;

public class NumSubarrayBoundedMax795 {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        return atMost(A, R) - atMost(A, L - 1);
    }

    private int atMost(int[] A, int k) {

        int pre = 0;
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= k) {
                pre += 1;
            } else {
                pre = 0;
            }
            ans += pre;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};
        System.out.println(new NumSubarrayBoundedMax795().numSubarrayBoundedMax(arr, 2,3));
    }
}
