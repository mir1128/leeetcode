package com.looboo.algorithm.leetcode;

public class ReverseLeftWordsOffer58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
