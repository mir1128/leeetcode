package com.looboo.algorithm.leetcode;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mapping = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (mapping.containsKey(temp)) {
                return new int[]{mapping.get(temp), i};
            } else {
                mapping.put(nums[i], i);
            }
        }
        return null;
    }
}
