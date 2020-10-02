package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class XorQueries1310Test {
    @Test
    public void test01() {
        int[] arr = {1, 3, 4, 8};
        int[][] query = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};

        assertArrayEquals(new int[]{2, 7, 14, 8}, new XorQueries1310().xorQueries(arr, query));
    }
}