package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LenLongestFibSubseq873Test {

    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //1,2,3,5,8
        assertEquals(5, new LenLongestFibSubseq873().lenLongestFibSubseq(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 3, 7, 11, 12, 14, 18};
        //3, 11, 14
        //7, 11, 18
        //1, 11, 12
        assertEquals(3, new LenLongestFibSubseq873().lenLongestFibSubseq(arr));
    }

    @Test
    public void test03() {
        int[] arr = {2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50};
        assertEquals(5, new LenLongestFibSubseq873().lenLongestFibSubseq(arr));
    }
}