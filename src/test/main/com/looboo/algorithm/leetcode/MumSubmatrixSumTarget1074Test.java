package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MumSubmatrixSumTarget1074Test {
    @Test
    public void test01() {
        int [][] arr = {{0,1,0},{1,1,1},{0,1,0}};
        assertEquals(4, new MumSubmatrixSumTarget1074().numSubmatrixSumTarget(arr, 0));
    }
}