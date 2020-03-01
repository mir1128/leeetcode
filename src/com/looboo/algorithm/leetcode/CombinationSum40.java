package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class CombinationSum40 {

    private Map<String, List<Integer>> result;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new HashMap<>();

        Stack<Integer> stack = new Stack<>();
        combinationSum2(candidates, 0, target, stack);
        List<List<Integer>> objects = new ArrayList<>();
        objects.addAll(result.values());
        return objects;
    }

    private void combinationSum2(int[] candidates, int start, int remain, Stack<Integer> stack) {
        if (remain == 0) {
            List<Integer> list = new ArrayList<>();
            list.addAll(stack);
            result.putIfAbsent(join(list), list);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (remain - candidates[i] >= 0) {
                stack.push(candidates[i]);
                combinationSum2(candidates, i + 1, remain - candidates[i], stack);
                stack.pop();
            }
        }
    }

    private String join(List<Integer> integers) {
        return integers.stream().sorted().map(i -> String.valueOf(i)).collect(Collectors.joining("-"));
    }

    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(new CombinationSum40().combinationSum2(arr, 8));
    }

}
