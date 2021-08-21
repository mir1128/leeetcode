package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfArithmeticSlices446 {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int[][] dp = new int[n][n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                dp[i][j] = 2;

                try {
                    int interval = Math.subtractExact(nums[j], nums[i]);
                    int prev = Math.subtractExact(nums[i], interval);
                    if (map.containsKey(prev)) {
                        List<Integer> list = map.get(prev);
                        for (int k = list.size() - 1; k >= 0; k--) {
                            if (list.get(k) < i) {
                                dp[i][j] = dp[list.get(k)][i] + k + 1;
                                break;
                            }
                        }
                    }
                } catch (ArithmeticException e) {
                    dp[i][j] = 2;
                }

                if (dp[i][j] >= 3) {
                    sum += (dp[i][j] - 2);
                }
            }
        }

        Utils.print(dp);

        return sum;
    }
}
