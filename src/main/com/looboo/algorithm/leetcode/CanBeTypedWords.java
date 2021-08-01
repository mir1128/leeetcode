package com.looboo.algorithm.leetcode;

public class CanBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] splits = text.split(" ");

        int n = 0;
        for (String str : splits ) {
            int i = 0;
            for (; i < brokenLetters.length(); i++) {
                if (str.contains(String.valueOf(brokenLetters.charAt(i)))) {
                    break;
                }
            }
            if (i == brokenLetters.length()) {
                n++;
            }
        }
        return n;
    }
}
