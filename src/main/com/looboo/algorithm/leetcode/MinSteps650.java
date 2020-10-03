package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSteps650 {
    public int minSteps(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            List<Integer> factors = factors(i);
            for (int j = 0; j < factors.size(); j++) {
                dp[i] = Math.min(dp[i], dp[factors.get(j)] + 1 + i / factors.get(j) - 1);
            }
        }

        return dp[n];
    }

    private List<Integer> factors(int n) { // from 3

        List<Integer> result = new ArrayList<>();

        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= Math.max(sqrt, n / 2); i++) {
            if (n % i == 0) result.add(i);
        }
        return result;
    }
}
