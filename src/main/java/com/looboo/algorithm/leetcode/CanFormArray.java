package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanFormArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = pieces.length;

        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            map.put(pieces[i][0], pieces[i]);
        }

        int index = 0;
        while (index < arr.length) {
            if (!map.containsKey(arr[index])) {
                return false;
            }

            int[] ints = map.get(arr[index]);

            int k = 0;
            while (k < ints.length) {
                if (ints[k] != arr[index]) {
                    return false;
                }
                ++k;
                ++index;
            }
        }

        return true;
    }
}
