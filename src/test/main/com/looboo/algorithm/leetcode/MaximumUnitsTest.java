package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumUnitsTest {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[5,10],[2,5],[4,7],[3,9]]");
        assertEquals(91, new MaximumUnits().maximumUnits(ints, 10));
    }

    @Test
    public void test02() {
        int[][] ints = Utils.intArray2d("[[1,3],[2,2],[3,1]]");
        assertEquals(8, new MaximumUnits().maximumUnits(ints, 4));
    }
}