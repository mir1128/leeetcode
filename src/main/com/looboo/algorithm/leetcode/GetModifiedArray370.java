package com.looboo.algorithm.leetcode;

public class GetModifiedArray370 {
    public int[] getModifiedArray(int length, int[][] updates) {

        int[] res = new int[length];

        for (int i = 0; i < updates.length; i++) {
            int[] update = updates[i];
            res[update[0]] += update[2];
            if (update[1] + 1 < length) {
                res[update[1] + 1] -= update[2];
            }
        }

        int[] res1 = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += res[i];
            res1[i] = sum;
        }

        return res1;
    }
}
