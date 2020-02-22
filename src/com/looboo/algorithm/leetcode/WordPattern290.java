package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> mapping = new HashMap<>();
        Map<String, Character> reverseMapping = new HashMap<>();

        String[] s = str.split(" ");

        if (pattern.length() != s.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (mapping.containsKey(pattern.charAt(i))
                    && reverseMapping.containsKey(s[i])
                    && mapping.get(pattern.charAt(i)).equals(s[i])
                    && reverseMapping.get(s[i]).equals(pattern.charAt(i))
            ) {
                continue;
            } else if (!mapping.containsKey(pattern.charAt(i)) && !reverseMapping.containsKey(s[i])) {
                mapping.put(pattern.charAt(i), s[i]);
                reverseMapping.put(s[i], pattern.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog dog dog dog";

        System.out.println(new WordPattern290().wordPattern(pattern, str));
    }
}
