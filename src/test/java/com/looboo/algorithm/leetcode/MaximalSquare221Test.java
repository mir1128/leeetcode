package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalSquare221Test {
    @Test
    public void test01() {
        char[][] arr = {{'0', '1'}, {'1', '0'}};
        assertEquals(1, new MaximalSquare221().maximalSquare(arr));
    }

    @Test
    public void test02() {
        char[][] arr = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        assertEquals(4, new MaximalSquare221().maximalSquare(arr));
    }
}