package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Character> reverseMapping = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (mapping.containsKey(s.charAt(i))
                    && reverseMapping.containsKey(t.charAt(i))
                    && mapping.get(s.charAt(i)).equals(t.charAt(i))
                    && reverseMapping.get(t.charAt(i)).equals(s.charAt(i))
            ) {
                continue;
            } else if (!mapping.containsKey(s.charAt(i)) && !reverseMapping.containsKey(t.charAt(i))) {
                mapping.put(s.charAt(i), t.charAt(i));
                reverseMapping.put(t.charAt(i), s.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
