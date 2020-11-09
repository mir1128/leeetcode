package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountRangeSum327Test {

    @Test
    public void test01() {
        int[] arr = {-2, 5, -1};
        assertEquals(3, new CountRangeSum327().countRangeSum(arr, -1,2));
    }
}