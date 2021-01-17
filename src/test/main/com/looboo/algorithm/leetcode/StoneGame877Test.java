package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneGame877Test {
    @Test
    public void test01() {
        assertTrue(new StoneGame877().stoneGame(new int[]{5, 3, 4, 5}));
        assertTrue(new StoneGame877().stoneGame1(new int[]{5, 3, 4, 5}));
    }
}