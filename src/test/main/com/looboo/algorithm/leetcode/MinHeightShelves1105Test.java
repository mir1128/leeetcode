package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinHeightShelves1105Test {
    @Test
    public void test01() {
        int[][] arr = {{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}};
        int shelf_width = 4;
        assertEquals(6, new MinHeightShelves1105().minHeightShelves(arr, shelf_width));
    }

    @Test
    public void test02() {
        int[][] arr = {{7, 3}, {8, 7}, {2, 7}, {2, 5}};
        int shelf_width = 10;
        assertEquals(15, new MinHeightShelves1105().minHeightShelves(arr, shelf_width));
    }
}