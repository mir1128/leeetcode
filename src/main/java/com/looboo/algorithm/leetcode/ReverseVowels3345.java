package com.looboo.algorithm.leetcode;

public class ReverseVowels3345 {
    public String reverseVowels(String s) {
        char[] result = s.toCharArray();

        int left = 0;
        int right = result.length - 1;

        while (left < right) {
            if (!isVowel(result[left])) {
                ++left;
                continue;
            }

            if (!isVowel(result[right])) {
                --right;
                continue;
            }

            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            ++left;
            --right;
        }

        return new String(result);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'A'
                || c == 'e' || c == 'E'
                || c == 'i' || c == 'I'
                || c == 'o' || c == 'O'
                || c == 'u' || c == 'U';
    }
}
