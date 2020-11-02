package com.looboo.algorithm.leetcode;

public class FurthestBuilding5556 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        int n = heights.length;
        int[][] choices = new int[n][2];

        int[] prev = new int[n];

        for (int i = 1; i < n; i++) {
            prev[i] = Math.max(0, heights[i] - heights[i - 1]);
        }

        choices[0] = new int[]{bricks, bricks};
        int i = 1;
        for (; i < n; i++) {
            if (prev[i] == 0) {
                choices[i] = choices[i - 1];
            } else {
                if (choices[i-1][0] >= prev[i]) {
                }
            }
        }

        return i;
    }
}
