package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {
        if (s.isEmpty()) return true;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v+1);
        }

        Integer next = map.values().iterator().next();
        return map.values().stream().allMatch(i -> i.equals(next));
    }

    public static void main(String[] args) {
        boolean res = new AreOccurrencesEqual().areOccurrencesEqual("abacbc");
        int a = 0;
    }
}
