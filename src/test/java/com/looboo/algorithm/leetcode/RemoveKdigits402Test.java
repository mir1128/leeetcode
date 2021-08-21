package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveKdigits402Test {
    @Test
    public void test01() {
        assertEquals("1219", new RemoveKdigits402().removeKdigits("1432219", 3));
    }

    @Test
    public void test02() {
        assertEquals("0", new RemoveKdigits402().removeKdigits("9", 1));
    }

    @Test
    public void test03() {
        assertEquals("11", new RemoveKdigits402().removeKdigits("112", 1));
    }
}