package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestArithSeqLength1027Test {
    @Test
    public void test01() {
        int[] arr = {3, 6, 9, 12};
        assertEquals(4, new LongestArithSeqLength1027().longestArithSeqLength(arr));
    }

    @Test
    public void test02() {
        int[] arr = {9, 4, 7, 2, 10};
        assertEquals(3, new LongestArithSeqLength1027().longestArithSeqLength(arr));
    }

    @Test
    public void test03() {
        int[] arr = {20, 1, 15, 3, 10, 5, 8};
        assertEquals(4, new LongestArithSeqLength1027().longestArithSeqLength(arr));
    }

    @Test
    public void test04() {
        int[] arr = {44, 46, 22, 68, 45, 66, 43, 9, 37, 30, 50, 67, 32, 47, 44, 11, 15, 4, 11, 6, 20, 64, 54, 54, 61, 63, 23, 43, 3, 12, 51, 61, 16, 57, 14, 12, 55, 17, 18, 25, 19, 28, 45, 56, 29, 39, 52, 8, 1, 21, 17, 21, 23, 70, 51, 61, 21, 52, 25, 28};
        assertEquals(6, new LongestArithSeqLength1027().longestArithSeqLength(arr));
    }

    @Test
    public void test05() {
        int[] arr = {83, 20, 17, 43, 52, 78, 68, 45};
        assertEquals(2, new LongestArithSeqLength1027().longestArithSeqLength(arr));
    }
}