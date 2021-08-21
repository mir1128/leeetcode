package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CloseStrings5603 {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            map1.compute(word1.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word2.length(); i++) {
            map2.compute(word2.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        if (!map1.keySet().containsAll(map2.keySet()) || !map2.keySet().containsAll(map1.keySet())) {
            return false;
        }

        List<Integer> v1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> v2 = map2.values().stream().sorted().collect(Collectors.toList());

        return v1.equals(v2);
    }
}
