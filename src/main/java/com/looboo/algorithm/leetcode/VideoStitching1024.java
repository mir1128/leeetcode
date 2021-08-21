package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class VideoStitching1024 {
    public int videoStitching(int[][] clips, int T) {

        List<List<Pair>> sortedByEnd = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            sortedByEnd.add(new ArrayList<>());
        }

        for (int i = 0; i < clips.length; i++) {
            if (clips[i][0] == clips[i][1]) continue;
            sortedByEnd.get(clips[i][1]).add(new Pair(clips[i][0], clips[i][1]));
        }

        int[] dp = new int[T + 1];
        dp[0] = 0;
        for (int i = 1; i <= T; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = i; j < sortedByEnd.size(); j++) {
                List<Pair> pairs = sortedByEnd.get(j);
                for (int k = 0; k < pairs.size(); k++) {
                    if (pairs.get(k).start >= i) continue;
                    if (dp[pairs.get(k).start] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[pairs.get(k).start] + 1, dp[i]);
                    }
                }
            }
        }
        return dp[T] == Integer.MAX_VALUE ? -1 : dp[T];
    }

    private static class Pair {
        public int start;
        public int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
