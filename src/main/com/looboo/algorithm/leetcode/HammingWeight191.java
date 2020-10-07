package com.looboo.algorithm.leetcode;

public class HammingWeight191 {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') res++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight191().hammingWeight(00000000000000000000000000001011));
        System.out.println(new HammingWeight191().hammingWeight(00000000000000000000000010000000));
        System.out.println(new HammingWeight191().hammingWeight(-3));
    }
}
