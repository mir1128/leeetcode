package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class IsValid20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();
                if (c == ')' && pop != '(') return false;
                if (c == ']' && pop != '[') return false;
                if (c == '}' && pop != '{') return false;
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(new IsValid20().isValid(s));
    }
}
