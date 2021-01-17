package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeString394Test {
    @Test
    public void test01() {
        assertEquals("aaabcbc", new DecodeString394().decodeString("3[a]2[bc]"));
    }

    @Test
    public void test02() {
        assertEquals("accaccacc", new DecodeString394().decodeString( "3[a2[c]]"));
    }
}