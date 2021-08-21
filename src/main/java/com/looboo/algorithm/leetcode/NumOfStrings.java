package com.looboo.algorithm.leetcode;

public class NumOfStrings {
    public int numOfStrings(String[] patterns, String word) {
        int n = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) n++;
        }

        return n;
    }
}
