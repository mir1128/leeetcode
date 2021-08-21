package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class RemoveKdigits402 {
    public String removeKdigits(String num, int k) {

        int n = k;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && (stack.peek() - '0' > num.charAt(i) - '0') && n > 0) {
                stack.pop();
                --n;
            }
            stack.push(num.charAt(i));
        }


        for (int i = 0; i < num.length() - k; i++) {
            if (stack.get(i) != '0') {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = i; j < num.length() - k; j++) {
                    stringBuilder.append(stack.get(j));
                }
                return stringBuilder.toString();
            }
        }
        return "0";
    }
}
