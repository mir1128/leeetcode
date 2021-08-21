package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumMatrix304Test {
    @Test
    public void test01() {
        int[][] arr = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        assertEquals(8, new NumMatrix304(arr).sumRegion(2,1,4,3));
    }
}