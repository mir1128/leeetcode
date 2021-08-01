package com.looboo.algorithm.leetcode;

public class LargestOddNumber {
    public String largestOddNumber(String num) {
        int end = -1;
        for (int i = 0; i < num.length(); ++i) {
            if (Integer.valueOf(num.charAt(i)) % 2 == 1) {
                end = i;
            }
        }
        if (end == -1) return "";
        return num.substring(0, end+1);
    }
}
