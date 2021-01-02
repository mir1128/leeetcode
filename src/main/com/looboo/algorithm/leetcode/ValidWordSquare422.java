package com.looboo.algorithm.leetcode;

import java.util.List;

public class ValidWordSquare422 {
    public boolean validWordSquare(List<String> words) {

        for (int i = 0; i < words.size(); i++) {
            if (!getN(words, i).equals(words.get(i))) return false;
        }

        return true;
    }

    private String getN(List<String> words, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > n) stringBuilder.append(words.get(i).charAt(n));
        }
        return stringBuilder.toString();
    }
}
