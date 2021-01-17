package com.looboo.algorithm.leetcode;

public class RemoveBoxes546 {

    private int[][][] dp = new int[100][100][100];

    public int removeBoxes(int[] boxes) {
        return calculatePoints(boxes, 0, boxes.length - 1, 0);
    }

    private int calculatePoints(int[] boxes, int l, int r, int k) {
        if (l > r) return 0;
        if (dp[l][r][k] != 0) return dp[l][r][k];

        dp[l][r][k] = calculatePoints(boxes, l, r - 1, 0) + (k + 1) * (k + 1);
        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                dp[l][r][k] = Math.max(dp[l][r][k], calculatePoints(boxes, l, i, k + 1) + calculatePoints(boxes, i + 1, r - 1, 0));
            }
        }
        return dp[l][r][k];
    }
}
