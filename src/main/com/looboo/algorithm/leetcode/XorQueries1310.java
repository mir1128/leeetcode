package com.looboo.algorithm.leetcode;

public class XorQueries1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] accumulate = new int[arr.length];

        accumulate[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            accumulate[i] = accumulate[i - 1] ^ arr[i];
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                result[i] = accumulate[queries[i][1]];
            } else {
                result[i] = accumulate[queries[i][1]] ^ accumulate[queries[i][0] - 1];
            }
        }

        return result;
    }
}
