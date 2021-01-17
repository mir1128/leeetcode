package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaysToSplitTest {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[1,1,1]");
        assertEquals(1, new WaysToSplit().waysToSplit1(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[1,2,2,2,5,0]");
        assertEquals(3, new WaysToSplit().waysToSplit1(ints));
    }

    @Test
    public void test03() {
        int[] ints = Utils.intArray1d("[3,2,1]");
        assertEquals(0, new WaysToSplit().waysToSplit1(ints));
    }

    @Test
    public void test04() {
        int[] ints = Utils.intArray1d("[2,3,2,7,7,1,9,4]");
        assertEquals(6, new WaysToSplit().waysToSplit1(ints));
    }


}