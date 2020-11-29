package com.looboo.algorithm.leetcode;

public class MaxRepeating {
    public int maxRepeating(String sequence, String word) {
        int i = 0;
        while (true) {
            if (sequence.contains(repeat(word, i + 1))) {
                ++i;
            } else {
                break;
            }
        }
        return i;
    }

    private String repeat(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
