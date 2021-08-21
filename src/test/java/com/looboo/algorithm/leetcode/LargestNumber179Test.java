package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumber179Test {
    @Test
    public void test01() {
        int[] arr = {10, 2};
        assertEquals("210", new LargestNumber179().largestNumber(arr));
    }
}