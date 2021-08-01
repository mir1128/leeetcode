package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMissingRanges163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= lower) continue;
            if (nums[i] >= upper) continue;

            String s = "";
            if (i == 0) {
                s = range(lower, nums[i]);
            } else if (i == nums.length-1) {
                s = range(nums[i], upper);
            } else {
                s = range(nums[i], nums[i+1]);
            }
            if (!s.isEmpty()) result.add(s);
        }

        return result;
    }

    private String range(int a, int b) {
        if (b - a == 1) return "";
        if (b - a == 2) return String.valueOf(a + 1);

        return String.format("%s->%s", a + 1, b - 1);
    }
}
