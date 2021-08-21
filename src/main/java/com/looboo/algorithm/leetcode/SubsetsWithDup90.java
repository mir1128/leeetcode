package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubsetsWithDup90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        int length = (int) Math.pow(2, nums.length);

        Map<String, List<Integer>> result = new HashMap<>();
        for (int i = 0; i < length; i++) {
            List<Integer> list = getList(nums, i);
            result.putIfAbsent(join(list), list);
        }
        List<List<Integer>> temp = new ArrayList<>();
        temp.addAll(result.values());
        return temp;
    }

    private List<Integer> getList(int[] nums, int i) {
        List<Integer> result = new ArrayList<>();
        int n = 0;
        int k = i;
        while (k != 0) {
            if (k % 2 == 1) result.add(nums[n]);
            k /= 2;
            ++n;
        }
        return result;
    }

    private String join(List<Integer> l) {
        return l.stream().map(i -> String.valueOf(i)).collect(Collectors.joining("-"));
    }


    public static void main(String[] args) {
        System.out.println(new SubsetsWithDup90().subsetsWithDup(new int[] {1,2,2}));
    }
}
