package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UtilsTest {

    @Test
    public void intArray1d() {

        String s = "[0,1,2, 3, 4, 5, 6]";
        int[] ints = Utils.intArray1d(s);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, ints);
    }

    @Test
    public void intArray2d() {
        String s = "[[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]]";
        int[][] ints = Utils.intArray2d(s);

        int[][] expect = new int[][]{{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}};
        for (int i = 0; i < 6; i++) {
            assertArrayEquals(expect[i], ints[i]);
        }
    }
}