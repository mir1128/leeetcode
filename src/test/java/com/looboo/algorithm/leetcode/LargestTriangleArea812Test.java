package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestTriangleArea812Test {
    @Test
    public void name() {
        assertEquals(2, new LargestTriangleArea812().largestTriangleArea(Utils.intArray2d("[[0,0],[0,1],[1,0],[0,2],[2,0]]")), 10^-6);
    }

    @Test
    public void test02() {
        assertEquals(0.5, new LargestTriangleArea812().largestTriangleArea(Utils.intArray2d("[[1,0],[0,0],[0,1]]")), 10^-6);
    }
}