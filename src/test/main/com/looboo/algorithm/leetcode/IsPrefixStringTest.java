package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrefixStringTest {
    @Test
    public void test01() {
        assertTrue(new IsPrefixString().isPrefixString("iloveleetcode", new String[]{ "i","love","leetcode","apples"}));
    }

    @Test
    public void test02() {

        assertFalse(new IsPrefixString().isPrefixString("iloveleetcode", new String[]{ "apples","i","love","leetcode"}));
    }
}