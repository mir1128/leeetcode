package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestMountain845Test {

    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[2,1,4,7,3,2,5]");
        assertEquals(5, new LongestMountain845().longestMountain(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[2,2,2]");
        assertEquals(0, new LongestMountain845().longestMountain(ints));
    }

    @Test
    public void test03() {
        int[] ints = Utils.intArray1d("[0,1,2,3,4,5,6,7,8,9]");
        assertEquals(0, new LongestMountain845().longestMountain(ints));
    }
}