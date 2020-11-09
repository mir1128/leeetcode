package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanCross403Test {
    @Test
    public void test01() {
        int[] arr = {0, 1, 3, 5, 6, 8, 12, 17};
        assertTrue(new CanCross403().canCross(arr));
    }

    @Test
    public void test02() {
        int[] arr = {0, 1, 2, 3, 4, 8, 9, 11};
        assertFalse(new CanCross403().canCross(arr));
    }

    @Test
    public void test03() {
        int[] arr = {0, 1, 3, 6, 10, 15, 16, 21};
        assertTrue(new CanCross403().canCross(arr));
    }


}