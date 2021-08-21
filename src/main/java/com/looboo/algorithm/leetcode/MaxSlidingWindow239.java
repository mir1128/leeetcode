package com.looboo.algorithm.leetcode;

import java.util.TreeMap;

public class MaxSlidingWindow239 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    map.compute(nums[j], (key, v) -> v == null ? 1 : v + 1);
                }
            } else {
                map.compute(nums[i - 1], (key, v) -> v - 1);
                if (map.get(nums[i - 1]) == 0) {
                    map.remove(nums[i - 1]);
                }
                map.compute(nums[i + k - 1], (key, v) -> v == null ? 1 : v + 1);
            }
            res[i] = map.lastKey();
        }

        return res;
    }
}
