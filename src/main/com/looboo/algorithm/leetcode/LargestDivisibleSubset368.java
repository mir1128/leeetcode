package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> dp = new ArrayList<>();

        dp.add(Arrays.asList(nums[0]));
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            dp.add(list);
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp.get(i).size() < dp.get(j).size() + 1) {
                    List<Integer> temp = new ArrayList<>();
                    temp.addAll(dp.get(j));
                    temp.add(nums[i]);
                    dp.set(i, temp);
                    if (dp.get(i).size() > dp.get(max).size()) {
                        max = i;
                    }
                }
            }
        }
        return dp.get(max);
    }
}
