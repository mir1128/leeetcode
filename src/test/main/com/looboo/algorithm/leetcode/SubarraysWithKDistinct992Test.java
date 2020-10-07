package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarraysWithKDistinct992Test {

    @Test
    public void test01() {
        int[] arr = {1,2,1,2,3};
        assertEquals(7, new SubarraysWithKDistinct992().subarraysWithKDistinct(arr, 2));
    }

    @Test
    public void test02() {
        int[] arr = {1,2,1,3,4};
        assertEquals(3, new SubarraysWithKDistinct992().subarraysWithKDistinct(arr, 3));
    }

}