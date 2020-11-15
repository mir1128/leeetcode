package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMin153Test {
    @Test
    public void test01() {
        assertEquals(1, new FindMin153().findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void test02() {
        assertEquals(0, new FindMin153().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }
}