package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneGameVITest {
    @Test
    public void test01() {
        assertEquals(1, new StoneGameVI().stoneGameVI(new int[]{1, 3}, new int[]{2, 1}));
    }

    @Test
    public void test02() {
        assertEquals(0, new StoneGameVI().stoneGameVI(new int[]{1, 2}, new int[]{3, 1}));
    }

    @Test
    public void test03() {
        assertEquals(-1, new StoneGameVI().stoneGameVI(new int[]{2, 4, 3}, new int[]{1, 6, 7}));
    }

    @Test
    public void test04() {
        assertEquals(1, new StoneGameVI().stoneGameVI(new int[]{9, 8, 3, 8}, new int[]{10, 6, 9, 5}));
    }
}