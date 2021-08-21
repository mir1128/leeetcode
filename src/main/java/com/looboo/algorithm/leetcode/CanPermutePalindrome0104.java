package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanPermutePalindrome0104 {
    public boolean canPermutePalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        return map.values().stream().filter(m -> m % 2 == 1).count() <= 1;
    }
}
