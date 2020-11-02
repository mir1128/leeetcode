package com.looboo.algorithm.leetcode;

public class CountSubstrings647 {
    public int countSubstrings(String s) {

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            sum += len(s, i, i);
            sum += len(s, i, i+1);
        }

        return sum + 1;
    }

    private int len(String s, int p1, int p2) {
        int n = 0;
        while (p1 - n >= 0 && p2 + n < s.length() && s.charAt(p1 - n) == s.charAt(p2 + n)) {
            ++n;
        }
        return n;
    }

}
