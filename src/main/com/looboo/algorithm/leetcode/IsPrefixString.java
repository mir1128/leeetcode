package com.looboo.algorithm.leetcode;

public class IsPrefixString {
    public boolean isPrefixString(String s, String[] words) {

        int prefix = 0;

        for (int i = 0; i < words.length; ++i) {

            if (s.substring(prefix).startsWith(words[i])) {
                prefix += words[i].length();
            } else {
                return false;
            }

            if (prefix == s.length()) {
                return true;
            }
        }
        return false;
    }
}
