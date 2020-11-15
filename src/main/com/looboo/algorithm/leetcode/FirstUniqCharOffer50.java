package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqCharOffer50 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return s.charAt(i);
        }
        return ' ';
    }
}
