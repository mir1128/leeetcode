package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsMatch44Test {
    @Test
    public void test01() {
        assertFalse(new IsMatch44().isMatch("aa", "a"));
    }

    @Test
    public void test02() {
        assertTrue(new IsMatch44().isMatch("aa", "*"));
    }

    @Test
    public void test03() {
        assertFalse(new IsMatch44().isMatch("cb", "?a"));
    }

    @Test
    public void test04() {
        assertTrue(new IsMatch44().isMatch("adceb", "*a*b"));
    }

    @Test
    public void test05() {
        assertFalse(new IsMatch44().isMatch("acdcb", "a*c?b"));
    }
}