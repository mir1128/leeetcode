package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TotalFruit904 {
    public int totalFruit(int[] tree) {

        int l = 0;

        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tree.length; i++) {
            if (map.containsKey(tree[i])) {
                map.computeIfPresent(tree[i], (k, v) -> v + 1);
                max = Math.max(max, i - l + 1);
            } else if (map.size() < 2) {
                map.put(tree[i], 1);
                max = Math.max(max, i - l + 1);
            } else {
                map.put(tree[i], 1);
                while (map.size() > 2) {
                    map.compute(tree[l++], (k, v) -> v = v - 1);
                    map.values().removeIf(v -> v.equals(0));
                }
            }
        }

        return max;
    }

    public int totalFruit1(int[] tree) {
        return atMost(tree, 2);
    }

    private int atMost(int[] tree, int k) {

        int max = 0;
        int l = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tree.length; i++) {
            if (!map.containsKey(tree[i])) k -= 1;
            map.compute(tree[i], (key, v) -> v == null ? 1 : v + 1);

            while (k < 0) {
                map.compute(tree[l++], (key, value) -> value - 1);

                if (map.values().removeIf(value -> value.equals(0))) {
                    k += 1;
                }
            }
            max = Math.max(max, i - l + 1);
        }
        return max;
    }

}
