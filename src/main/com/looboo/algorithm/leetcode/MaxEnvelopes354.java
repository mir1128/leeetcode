package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxEnvelopes354 {
    public int maxEnvelopes(int[][] envelopes) {
        List<Pair> sortedEnvelopes = sort(envelopes);

        int[] dp = new int[sortedEnvelopes.size()];
        dp[0] = 1;

        int max = 1;
        for (int i = 1; i < sortedEnvelopes.size(); i++) {
            dp[i] = 1;
            Pair envelopCur = sortedEnvelopes.get(i);
            for (int j = i - 1; j >=0; j--) {
                Pair envelopPre = sortedEnvelopes.get(j);
                if (envelopCur.width > envelopPre.width && envelopCur.height > envelopPre.height) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }

        return max;
    }

    private List<Pair> sort(int[][] envelopes) {
        List<Pair> result = new ArrayList<>();

        for (int i = 0; i < envelopes.length; i++) {
            result.add(new Pair(envelopes[i][0], envelopes[i][1]));
        }

        result.sort(Comparator.comparingInt(p -> p.width));
        return result;
    }

    private static class Pair {
        public int width;
        public int height;

        public Pair(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
