package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneGameVIITest {

    @Test
    public void test01() {
        assertEquals(6, new StoneGameVII().stoneGameVII(new int[]{5, 3, 1, 4, 2}));
    }

    @Test
    public void test02() {
        assertEquals(122, new StoneGameVII().stoneGameVII(new int[]{7, 90, 5, 1, 100, 10, 10, 2}));
    }
}