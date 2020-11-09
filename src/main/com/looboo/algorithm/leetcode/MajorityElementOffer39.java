package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementOffer39 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
            if (map.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }
}
