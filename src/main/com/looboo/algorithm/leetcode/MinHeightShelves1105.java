package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinHeightShelves1105 {
    public int minHeightShelves(int[][] books, int shelf_width) {
        int n = books.length;
        int[] dp = new int[n];
        dp[0] = books[0][1];

        for (int i = 1; i < n; i++) {

            List<Pair> possibles = new ArrayList<>();
            int sum = books[i][0];
            int height = books[i][1];

            int j = i;
            while (sum <= shelf_width && j >= 0) {
                height = Math.max(height, books[j][1]);
                possibles.add(new Pair(j, height));
                --j;
                if (j < 0) break;
                sum += books[j][0];
            }

            dp[i] = Integer.MAX_VALUE;
            for (int k = 0; k < possibles.size(); k++) {
                if (possibles.get(k).index == 0 && possibles.get(k).height < dp[i]) {
                    dp[i] = possibles.get(k).height;
                    continue;
                }

                if (possibles.get(k).height + dp[possibles.get(k).index - 1] < dp[i]) {
                    dp[i] = possibles.get(k).height + dp[possibles.get(k).index - 1];
                }
            }

        }
        return dp[n-1];
    }

    public static class Pair {
        public int index;
        public int height;

        public Pair(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }
}
