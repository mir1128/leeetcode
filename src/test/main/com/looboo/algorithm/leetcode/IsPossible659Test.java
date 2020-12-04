package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPossible659Test {
    @Test
    public void test01() {
        assertTrue(new IsPossible659().isPossible1(new int[]{1, 2, 3, 3, 4, 5}));
    }

    @Test
    public void test02() {
        assertFalse(new IsPossible659().isPossible1(new int[]{1, 2, 3, 4, 4, 5}));
    }
}