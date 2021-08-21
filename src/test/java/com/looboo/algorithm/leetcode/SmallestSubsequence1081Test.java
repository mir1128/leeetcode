package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestSubsequence1081Test {
    @Test
    public void test01() {
        assertEquals("acdb", new SmallestSubsequence1081().smallestSubsequence("cbacdcbc"));
    }

    @Test
    public void test02() {
        assertEquals("adbc", new SmallestSubsequence1081().smallestSubsequence("cdadabcc"));
    }

    @Test
    public void test03() {
        assertEquals("ab", new SmallestSubsequence1081().smallestSubsequence("baababaaaaababbbbbbaababaababa"));
    }

    @Test
    public void test04() {
        assertEquals("bca", new SmallestSubsequence1081().smallestSubsequence("bcbcbcababa"));
    }

}
