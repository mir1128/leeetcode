package com.looboo.algorithm.leetcode;

import java.util.Stack;
import java.util.stream.Collectors;

public class DecodeString394 {
        public String decodeString(String s) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ']') {
                    stack.push(s.charAt(i));
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    while (!stack.isEmpty() && stack.peek() != '[') stringBuilder.append(stack.pop());

                    stack.pop();
                    StringBuilder count = new StringBuilder();
                    while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') count.append(stack.pop());

                    Integer integer = Integer.valueOf(count.reverse().toString());
                    String decoded = repeat(stringBuilder.reverse().toString(), integer);
                    for (int j = 0; j < decoded.length(); j++) {
                        stack.push(decoded.charAt(j));
                    }
                }
            }

            return stack.stream().map(String::valueOf).collect(Collectors.joining());
        }

        private String repeat(String s, int n) {
            StringBuilder  stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        }
}
