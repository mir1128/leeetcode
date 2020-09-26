package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    public int singleNumber1(int[] nums) {

        if (nums.length == 1) return nums[0];

        int s = nums[0];
        for (int i = 1; i < nums.length; i++) {
            s = s ^ nums[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println(new SingleNumber136().singleNumber1(arr));
    }
}
