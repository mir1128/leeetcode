package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumMountainRemovalsTest {
    @Test
    public void test01() {
        int[] arr = {2, 1, 1, 5, 6, 2, 3, 1};
        assertEquals(3, new MinimumMountainRemovals().minimumMountainRemovals(arr));
    }
}