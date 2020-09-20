package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CombinationSum216 {

    private boolean[] used;
    private List<List<Integer>> result;

    public List<List<Integer>> combinationSum3(int k, int n) {
        used = new boolean[9];
        result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        combinationSum3(k, n, stack, 1);

        return result;
    }

    private void combinationSum3(int remainNumbers, int remainTotal, Stack<Integer> stack, int start) {
        if (remainTotal == 0 && remainNumbers == 0) {
            List<Integer> list = new ArrayList<>();
            list.addAll(stack);
            result.add(list);
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (remainNumbers > 0 && i <= remainTotal) {
                stack.push(i);
                combinationSum3(remainNumbers-1, remainTotal-i,  stack, i+1);
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new CombinationSum216().combinationSum3(3, 7));
    }
}
