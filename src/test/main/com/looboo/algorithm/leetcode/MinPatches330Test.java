package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinPatches330Test {
    @Test
    public void test01() {
        assertEquals(1, new MinPatches330().minPatches(new int[]{1, 3}, 6));
    }

    @Test
    public void test02() {
        assertEquals(2, new MinPatches330().minPatches(new int[]{1, 5, 10}, 20));
    }
}