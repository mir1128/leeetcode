package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumTilings790Test {
    @Test
    public void test01() {
        assertEquals(5, new NumTilings790().numTilings(3));
    }

    @Test
    public void test02() {
        assertEquals(24, new NumTilings790().numTilings(5));
    }

    @Test
    public void test03() {
        assertEquals(53, new NumTilings790().numTilings(6));
    }

    @Test
    public void test04() {
        assertEquals(979232805, new NumTilings790().numTilings(1000));
    }
}