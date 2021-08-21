package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinFallingPathSum931Test {

    @Test
    public void test01() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(12,new MinFallingPathSum931().minFallingPathSum(arr));
    }
}