package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters316 {
    public String removeDuplicateLetters(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            while (!stack.isEmpty() && !set.contains(s.charAt(i)) && s.charAt(i) <= stack.peek() && map.get(stack.peek()) > 1) {
                Character pop = stack.pop();
                set.remove(pop);
                map.compute(pop, (k, v) -> v - 1);
            }
            if (set.contains(s.charAt(i))) {
                map.compute(s.charAt(i), (k, v) -> v - 1);
            } else {
                set.add(s.charAt(i));
                stack.push(s.charAt(i));
            }
        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
