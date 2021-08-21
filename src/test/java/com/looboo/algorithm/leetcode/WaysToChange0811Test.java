package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaysToChange0811Test {
    @Test
    public void test01() {
        assertEquals(2, new WaysToChange0811().waysToChange(5));
    }

    @Test
    public void test02() {
        assertEquals(4, new WaysToChange0811().waysToChange(10));
    }
}