package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            smap.compute(s.charAt(i), (k, v) -> v == null ? 1 : ++v);
        }

        for (int i = 0; i < t.length(); i++) {
            smap.compute(t.charAt(i), (k, v)  -> v == null ? -1: --v);
        }

        return smap.values().stream().allMatch(v -> v == 0);
    }

}
