package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestArithSeqLength1027 {
    public int longestArithSeqLength(int[] nums) {

        int n = nums.length;

        int[][] dp = new int[n][n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int max = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = 2;
                } else {
                    int interval = nums[j] - nums[i];

                    if (map.containsKey(nums[i] - interval)) {
                        List<Integer> prevs = map.get(nums[i] - interval);
                        int temp = 2;

                        for (int k = prevs.size()-1; k >=0 ; k--) {
                            int prev = prevs.get(k);
                            if (prev < i) {
                                if (dp[prev][i] + 1 > temp) {
                                    temp = dp[prev][i] + 1;
                                    break;
                                }
                            }
                        }
                        dp[i][j] = temp;
                        max = Math.max(max, temp);
                    } else {
                        dp[i][j] = 2;
                    }
                }
            }
        }

        return max;
    }
}
