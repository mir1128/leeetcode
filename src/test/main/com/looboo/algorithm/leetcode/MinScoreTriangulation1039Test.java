package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinScoreTriangulation1039Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[1,2,3]");
        assertEquals(6, new MinScoreTriangulation1039().minScoreTriangulation(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[3,7,4,5]");
        assertEquals(144, new MinScoreTriangulation1039().minScoreTriangulation(ints));
    }
}