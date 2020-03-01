package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combine77 {
    private List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        combine(n, k, 1, stack);
        return result;
    }

    private void combine(int n, int k, int start, Stack<Integer> stack) {

        if (stack.size() == k) {
            List<Integer> list = new ArrayList<>();
            list.addAll(stack);
            result.add(list);
            return;
        }

        for (int i = start; i <= n; i++) {
            stack.push(i);
            combine(n, k, i + 1, stack);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Combine77().combine(4, 2));
    }
}
