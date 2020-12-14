package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRectangleArea84Test {
    @Test
    public void test01() {
        assertEquals(2, new LargestRectangleArea84().largestRectangleArea1(new int[]{1, 1}));
    }

    @Test
    public void test02() {
        assertEquals(10, new LargestRectangleArea84().largestRectangleArea1(new int[]{4, 2, 0, 3, 2, 4, 3, 4}));
    }
}