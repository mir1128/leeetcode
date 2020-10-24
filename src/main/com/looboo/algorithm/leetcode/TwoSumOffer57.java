package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumOffer57 {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                return new int[] {target - nums[i], nums[i]};
            } else {
                set.add(nums[i]);
            }
        }

        return null;
    }
}
