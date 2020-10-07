package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeight1046Test {

    @Test
    public void test01() {
        int[] arr = {2, 7, 4, 1, 8, 1};
        assertEquals(1, new LastStoneWeight1046().lastStoneWeight(arr));
    }
}