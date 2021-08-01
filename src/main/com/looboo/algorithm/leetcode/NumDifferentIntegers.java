package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumDifferentIntegers {
    public int numDifferentIntegers(String word) {

        Set<String> list = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                stringBuilder.append(word.charAt(i));
            } else {
                if (stringBuilder.length() !=0) {
                    list.add(trim(stringBuilder.toString()));
                    stringBuilder = new StringBuilder();
                }
            }
        }
        if (stringBuilder.length() !=0) {
            list.add(trim(stringBuilder.toString()));
        }
        return list.size();
    }

    private String trim(String s) {
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) != '0') break;
        }

        if (i == s.length()) return "0";
        return s.substring(i);
    }
}
