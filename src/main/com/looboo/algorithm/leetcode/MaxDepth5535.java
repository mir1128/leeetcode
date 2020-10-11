package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class MaxDepth5535 {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                if (stack.size() > max) {
                    max = stack.size();
                }
            } else if (s.charAt(i) == ')') {
                stack.pop();
            }
        }
        return max;
    }
}
