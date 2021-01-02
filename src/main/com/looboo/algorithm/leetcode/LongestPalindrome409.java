package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        int a = (int) (map.values().stream().filter(v -> v % 2 == 1).count() - 1);

        return s.length() - Math.max(a, 0);
    }
}
