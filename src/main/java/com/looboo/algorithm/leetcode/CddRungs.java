package com.looboo.algorithm.leetcode;

public class CddRungs {
    public int addRungs(int[] rungs, int dist) {
        int n = rungs.length;

        int res = 0;
        for (int i = 0; i < n; i++) {
            int diff = rungs[i] - (i == 0 ? 0 : rungs[i - 1]);

            if (diff <= dist) {
                res += 0;
            } else {
                if (diff % dist == 0) {
                    res += diff/dist-1;
                } else {
                    res += diff/dist;
                }
            }

        }
        return res;

    }
}
