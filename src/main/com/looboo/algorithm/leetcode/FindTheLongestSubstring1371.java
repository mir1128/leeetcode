package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTheLongestSubstring1371 {

    public int findTheLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 2);
        map.put('i', 4);
        map.put('o', 8);
        map.put('u', 16);

        Map<Integer, Integer> staticPositionMapping = new HashMap<>();
        staticPositionMapping.put(0, -1);

        int curr = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                curr ^= map.get(s.charAt(i));
            }

            if (staticPositionMapping.containsKey(curr)) {
                result = Math.max(result, i - staticPositionMapping.get(curr));
            } else {
                staticPositionMapping.put(curr, i);
            }
        }
        return result;
    }
}
