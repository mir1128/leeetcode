package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int n = 0;
        for (int i = 0; i < words.length; i++) {
            int j = 0;
            for (; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    break;
                }
            }
            if (j == words[i].length()) {
                n++;
            }
        }
        return n;
    }
}
