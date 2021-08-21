package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            map1.compute(magazine.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            map2.compute(ransomNote.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        return map2.entrySet().stream().allMatch(e -> map1.containsKey(e.getKey()) && map1.get(e.getKey()) >= e.getValue());
    }
}
