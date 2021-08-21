package com.looboo.algorithm.leetcode;

public class SortedSquares977 {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];

        int zeroIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                zeroIndex = i;
                break;
            }
        }

        int negative = zeroIndex - 1;

        int curr = 0;
        while (negative >= 0 && zeroIndex < A.length) {
            if (A[negative] + A[zeroIndex] == 0) {
                res[curr] = A[negative] * A[negative];
                ++curr;
                --negative;
                res[curr] = A[zeroIndex] * A[zeroIndex];
                ++curr;
                ++zeroIndex;
            } else if (A[negative] + A[zeroIndex] > 0) {
                res[curr] = A[negative] * A[negative];
                curr++;
                negative--;
            } else {
                res[curr] = A[zeroIndex] * A[zeroIndex];
                curr++;
                zeroIndex++;
            }
        }

        while (zeroIndex < A.length) {
            res[curr] = A[zeroIndex] * A[zeroIndex];
            curr++;
            zeroIndex++;
        }

        while (negative >= 0) {
            res[curr] = A[negative] * A[negative];
            curr++;
            negative--;
        }
        return res;
    }
}
