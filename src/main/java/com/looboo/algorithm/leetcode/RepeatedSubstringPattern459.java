package com.looboo.algorithm.leetcode;

public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean repeatedSubstringPattern1(String s) {
        return (s + s).indexOf(s, 1) < s.length();
    }
}
