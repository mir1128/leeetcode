package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeStones1000Test {
    @Test
    public void test01() {
        assertEquals(20, new MergeStones1000().mergeStones(new int[]{3, 2, 4, 1}, 2));
    }

    @Test
    public void test02() {
        assertEquals(-1, new MergeStones1000().mergeStones(new int[]{3, 2, 4, 1}, 3));
    }

    @Test
    public void test03() {
        assertEquals(25, new MergeStones1000().mergeStones(new int[]{3, 5, 1, 2, 6}, 3));
    }
}