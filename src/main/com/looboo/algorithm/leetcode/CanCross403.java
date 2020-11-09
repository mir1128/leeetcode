package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanCross403 {
    public boolean canCross(int[] stones) {
        int length = stones.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(stones[i], i);
        }

        boolean[][] dp = new boolean[length][length];

        if (stones[1] != 1) return false;

        dp[0][1] = true;

        for (int col = 2; col < length; ++col) {
            for (int row = 0; row < col; row++) {
                int k = stones[col] - stones[row];

                if (map.containsKey(stones[row] - k) && dp[map.get(stones[row] - k)][row]) {
                    dp[row][col] = true;
                } else if (map.containsKey(stones[row] - (k - 1)) && dp[map.get(stones[row] - (k - 1))][row]) {
                    dp[row][col] = true;
                } else if (map.containsKey(stones[row] - (k + 1)) && dp[map.get(stones[row] - (k + 1))][row]) {
                    dp[row][col] = true;
                } else {
                    dp[row][col] = false;
                }
            }
        }

        for (int row = 0; row < length - 1; row++) {
            if (dp[row][length-1]) return true;
        }

        return false;
    }
}
