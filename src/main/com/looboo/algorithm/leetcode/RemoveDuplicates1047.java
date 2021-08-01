package com.looboo.algorithm.leetcode;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicates1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < S.length(); ++i) {
            if(stack.isEmpty() || stack.peek() != S.charAt(i)) {
                stack.push(S.charAt(i));
            } else {
                stack.pop();
            }
        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
