package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinDistance583Test {

    @Test
    public void test01() {
        assertEquals(2, new MinDistance583().minDistance("sea", "eat"));
    }

    @Test
    public void test02() {
        assertEquals(1, new MinDistance583().minDistance("a", "ab"));
    }
}