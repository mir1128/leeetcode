package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLength718Test {
    @Test
    public void test01() {

        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        assertEquals(3, new FindLength718().findLength(A, B));
    }
}