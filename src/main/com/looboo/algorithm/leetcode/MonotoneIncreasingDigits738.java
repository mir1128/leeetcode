package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class MonotoneIncreasingDigits738 {
    public int monotoneIncreasingDigits(int N) {

        Stack<Character> stack = new Stack<>();

        String s = String.valueOf(N);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            while (!stack.isEmpty() && s.charAt(i) > stack.peek()) {
                stringBuilder.append(stack.pop());
            }

            if (!stack.isEmpty() && s.charAt(i) < stack.peek()) {
                break;
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stringBuilder.length() == s.length() - 1) {
            stringBuilder.append(stack.get(0) - '0');
        } else {
            stringBuilder.append(stack.get(0) - '0' - 1);
            int remain = s.length() - stringBuilder.length();
            for (int i = 0; i < remain; i++) {
                stringBuilder.append(9);
            }
        }

        return Integer.parseInt(stringBuilder.toString());
    }
}
