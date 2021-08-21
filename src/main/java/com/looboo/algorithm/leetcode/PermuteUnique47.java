package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class PermuteUnique47 {

    private Map<String, List<Integer>> mapping;
    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {

        mapping = new HashMap<>();
        used = new boolean[nums.length];

        Stack<Integer> stack = new Stack<>();
        permuteUnique(nums, stack);

        List<List<Integer>> result = new ArrayList<>();
        result.addAll(mapping.values());
        return result;
    }

    private void permuteUnique(int[] nums, Stack<Integer> current) {
        if (nums.length == current.size()) {
            List<Integer> onePermute = new ArrayList<>();
            onePermute.addAll(current);
            mapping.putIfAbsent(join(onePermute), onePermute);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                current.push(nums[i]);
                used[i] = true;
                permuteUnique(nums, current);
                used[i] = false;
                current.pop();
            }
        }
    }

    private String join(List<Integer> list) {
        return list.stream().map(i -> String.valueOf(i)).collect(Collectors.joining("-"));
    }

    public static void main(String[] args) {
        System.out.println(new PermuteUnique47().permuteUnique(new int[] {1,1,2}));
    }
}
