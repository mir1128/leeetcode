package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthUglyNumber264Test {
    @Test
    public void test01() {
        assertEquals(12, new NthUglyNumber264().nthUglyNumber(10));
    }

    @Test
    public void test02() {
        assertEquals(402653184, new NthUglyNumber264().nthUglyNumber(1352));
    }
}