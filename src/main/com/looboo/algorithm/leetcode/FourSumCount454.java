package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> mapping = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                mapping.compute(A[i] + B[j], (k, v) -> v == null ? 1 : ++v);
            }
        }

        int result = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int temp = -C[i] - D[j];
                if (mapping.containsKey(temp)) {
                    result += mapping.get(temp);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {-1, -1};
        int b[] = {-1, 1};
        int c[] = {-1, 1};
        int d[] = {1, -1};


        new FourSumCount454().fourSumCount(a, b, c, d);
    }
}
