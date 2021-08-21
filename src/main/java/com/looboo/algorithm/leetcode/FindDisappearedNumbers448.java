package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class FindDisappearedNumbers448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Set<Integer> range = IntStream.range(1, nums.length + 1).collect(HashSet::new, HashSet::add, (s1, s2) -> s1.addAll(s2));
        range.removeAll(set);
        return new ArrayList<>(range);
    }
}
