package com.looboo.algorithm.leetcode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintNumbersOffer17 {
    public int[] printNumbers(int n) {

        int pow = (int) Math.pow(10, n);
        return IntStream.range(1, pow).toArray();
    }
}
