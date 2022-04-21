package com.looboo.algorithm.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combination {
    public static List<List<Integer>> combine(int[] nums, int target) {

        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        combine(nums, target, 0, 0, stack, result);

        return result;
    }

    private static void combine(int[] nums, int target, int has, int curr,
                                Stack<Integer> stack,
                                List<List<Integer>> result) {
        if (target == has) {
            result.add(new ArrayList<>(stack));
        }

        for (int i = curr; i < nums.length; i++) {
            if (stack.contains(nums[i])) continue;
            stack.add(nums[i]);
            combine(nums, target, has + 1, i, stack, result);
            stack.pop();
        }
    }

}
