package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPointsTest {
    @Test
    public void name() {
        int[][] ints = Utils.intArray2d("[[5,2,1,2],[2,1,5,2],[5,5,5,0]]");
        long l = new MaxPoints().maxPoints(ints);
        assertEquals(l ,13);
    }
}