package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmallestSubsequence1081 {
    public String smallestSubsequence(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.contains(s.charAt(i))) {
                map.compute(s.charAt(i), (k, v) -> v - 1);
                continue;
            }


            while (!stack.isEmpty() && stack.peek() > s.charAt(i) && map.get(stack.peek()) > 1) {
                Character pop = stack.pop();
                map.compute(pop, (k, v) -> v - 1);
            }
            stack.push(s.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            stringBuilder.append(stack.get(i));
        }

        return stringBuilder.toString();
    }
}
