package com.looboo.algorithm.leetcode;

public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        String s = Integer.toBinaryString(x ^ y);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') sum++;
        }
        return sum;
    }
}
