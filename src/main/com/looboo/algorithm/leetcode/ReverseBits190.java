package com.looboo.algorithm.leetcode;

public class ReverseBits190 {
    public int reverseBits(int n) {

        String s = Integer.toBinaryString(n);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 32 - s.length(); i++) {
            stringBuilder.append('0');
        }
        StringBuilder reverse = stringBuilder.append(s).reverse();

        return Integer.parseInt(reverse, 0, 32, 2);
    }

    public static void main(String[] args) {
        int x = 0b00000010100101000001111010011100;
        System.out.println(new ReverseBits190().reverseBits(x));
        System.out.println(new ReverseBits190().reverseBits(0b11111111111111111111111111111101));
    }
}
