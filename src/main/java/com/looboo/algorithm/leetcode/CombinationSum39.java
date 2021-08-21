package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class CombinationSum39 {

    private Map<String, List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new HashMap<>();

        Stack<Integer> stack = new Stack<>();
        combinationSum(candidates, stack, target);

        List<List<Integer>> arrayList = new ArrayList<>();
        arrayList.addAll(result.values());
        return arrayList;
    }

    private void combinationSum(int[] candidates, Stack<Integer> stack, int remain) {
        if (remain == 0) {
            List<Integer> integers = new ArrayList<>();
            integers.addAll(stack);
            result.putIfAbsent(join(integers), integers);
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (remain - candidates[i] >= 0) {
                stack.push(candidates[i]);
                combinationSum(candidates, stack, remain - candidates[i]);
                stack.pop();
            }
        }
    }

    private String join(List<Integer> integers) {
        return integers.stream().sorted().map(i -> String.valueOf(i)).collect(Collectors.joining("-"));
    }

    public static void main(String[] args) {
        System.out.println(new CombinationSum39().combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
