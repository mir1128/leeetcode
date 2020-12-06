package com.looboo.algorithm.leetcode;

public class ConcatenatedBinary {
    public int concatenatedBinary(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(Integer.toBinaryString(i));
        }

        String s = stringBuilder.toString();
        int res = 0;
        for (int i = 0; i < s.length() ; i++) {
            res = ((res * 2 + (s.charAt(i) - '0')) % 1000000007);
        }
        return res;
    }
}
