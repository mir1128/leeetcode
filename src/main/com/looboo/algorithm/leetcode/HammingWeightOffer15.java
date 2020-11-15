package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class HammingWeightOffer15 {
    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);
        return (int) IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '1').count();

    }
}
