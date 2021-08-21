package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePairsOffer51Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[7,5,6,4]");

        assertEquals(5, new ReversePairsOffer51().reversePairs(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[2,4,3,5,1]");

        assertEquals(5, new ReversePairsOffer51().reversePairs(ints));
    }
}