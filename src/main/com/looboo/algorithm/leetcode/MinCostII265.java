package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class MinCostII265 {
    public int minCostII(int[][] costs) {
        int m = costs.length;
        int k = costs[0].length;

        int[] val = new int[k];
        for (int i = 0; i < k; i++) {
            val[i] = costs[0][i];
        }

        for (int i = 1; i < m; i++) {
            int[] temp = new int[k];
            for (int j = 0; j < k; j++) {
                temp[j] = min(val, j) + costs[i][j];
            }
            val = temp;
        }
        return min(val);
    }

    private int min(int[] arr, int exclude) {
        return IntStream.range(0, arr.length).filter(i -> i != exclude).map(i -> arr[i]).min().getAsInt();
    }

    private int min(int[] arr) {
        return IntStream.of(arr).min().getAsInt();
    }
}
