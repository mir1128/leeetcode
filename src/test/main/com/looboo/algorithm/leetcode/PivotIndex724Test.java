package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PivotIndex724Test {


    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[-1,-1,-1,-1,-1,0]");
        assertEquals(2, new PivotIndex724().pivotIndex(ints));
    }
}