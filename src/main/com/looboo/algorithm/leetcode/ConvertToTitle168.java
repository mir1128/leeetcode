package com.looboo.algorithm.leetcode;

public class ConvertToTitle168 {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        while (n != 0) {
            stringBuilder.insert(0, (char) ('A' + (n - 1) % 26));
            n = (n - 1) / 26;
        }
        return stringBuilder.toString();
    }
}
