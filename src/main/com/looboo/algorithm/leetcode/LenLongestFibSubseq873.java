package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LenLongestFibSubseq873 {
    public int lenLongestFibSubseq(int[] A) {
        int n = A.length;

        if (n == 0) return 0;
        if (n == 1) return 1;

        int[][] dp = new int[n][n];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i], i);
        }

        int max = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = 2;
                } else {
                    int temp = A[j] - A[i];
                    if (map.containsKey(temp)) {

                        if (map.get(temp) < i) {
                            dp[i][j] = dp[map.get(temp)][i] + 1;
                            if (dp[i][j] > max) {
                                max = dp[i][j];
                            }
                        } else {
                            dp[i][j] = 2;
                        }
                    } else {
                        dp[i][j] = 2;
                    }
                }
            }
        }

        Utils.print(dp);

        return max;
    }
}
