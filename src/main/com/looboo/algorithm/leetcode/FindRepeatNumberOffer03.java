package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumberOffer03 {
    public int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
