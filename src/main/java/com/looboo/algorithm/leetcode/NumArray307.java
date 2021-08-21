package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumArray307 {

    private int[] sum;
    private int[] origin;
    private Map<Integer, Integer> updateMap = new HashMap<>();

    public NumArray307(int[] nums) {
        origin = nums;
        int length = nums.length;
        if (length == 0) return;

        sum = new int[length];
        int total = 0;
        for (int i = 0; i < length; i++) {
            total += nums[i];
            sum[i] = total;
        }
    }

    public void update(int i, int val) {
        updateMap.put(i, val - origin[i]);
    }

    public int sumRange(int i, int j) {
        int total = sum[j] - (i > 0 ? sum[i-1] : 0);
        int delta = updateMap.entrySet().stream()
                .filter(e -> (e.getKey() >= i && e.getKey() <= j)).mapToInt(Map.Entry::getValue)
                .sum();

        return total + delta;
    }
}
