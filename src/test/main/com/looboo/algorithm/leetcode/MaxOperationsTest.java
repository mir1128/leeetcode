package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxOperationsTest {
    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(2, new MaxOperations().maxOperations(arr, 5));
    }

    @Test
    public void test02() {
        int[] arr = {3, 1, 3, 4, 3};
        assertEquals(1, new MaxOperations().maxOperations(arr, 6));
    }
}