package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxOperations {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (key, v) -> v == null ? 1 : v + 1);
        }

        int res = 0;
        for (Integer key : map.keySet()) {

            if (key * 2 == k) {
                if (map.containsKey(key) && map.get(key) >= 2) {
                    res += map.get(key) / 2;
                    map.put(key, 0);
                }
            } else {
                if (map.containsKey(k - key) && (map.get(key) > 0) && (map.get(k - key) > 0)) {
                    int t = Math.min(map.get(key), map.get(k - key));
                    map.put(key, map.get(key) - t);
                    map.put(k - key, map.get(k - key) - t);
                    res += t;
                }
            }
        }
        return res;
    }
}
