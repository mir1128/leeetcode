package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSizeSlices1388 {
    int calculate(List<Integer> slices) {
        int n = slices.size();
        int choose = (n + 1) / 3;
        int[][] dp = new int[n + 1][choose+1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= choose; ++j) {
                dp[i][j] = Math.max(dp[i - 1][j], (i - 2 >= 0 ? dp[i - 2][j - 1] : 0) + slices.get(i - 1));
            }
        }
        return dp[n][choose];
    }

    int maxSizeSlices(int[] slices) {

        List<Integer> v = Arrays.stream(slices).boxed().collect(Collectors.toList());

        int ans1 = calculate(v.subList(1, v.size()));
        int ans2 = calculate(v.subList(0, v.size()-1));
        return Math.max(ans1, ans2);
    }
}
