package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumEquivDominoPairs1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes.length <= 1) return 0;

        Map<Pair, Integer> map = new HashMap<>();

        for (int i = 0; i < dominoes.length; i++) {
            Pair pair = new Pair(dominoes[i][0], dominoes[i][1]);
            map.compute(pair, (k, v) -> v == null ? 1 : v + 1);
        }
        return map.values().stream().filter(v -> v >= 2).mapToInt(i -> (i - 1) * i / 2).sum();
    }

    private static class Pair {
        public int v1;
        public int v2;

        public Pair(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(v1) + Integer.hashCode(v2);
        }

        @Override
        public boolean equals(Object obj) {
            Pair pair = (Pair) obj;
            if (pair == null) return false;
            return (this.v1 == pair.v1 && this.v2 == pair.v2)
                    || (this.v1 == pair.v2 && this.v2 == pair.v1);
        }
    }
}
