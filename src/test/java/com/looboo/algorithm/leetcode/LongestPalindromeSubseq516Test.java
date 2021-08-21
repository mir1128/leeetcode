package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeSubseq516Test {
    @Test
    public void test01() {
        assertEquals(4, new LongestPalindromeSubseq516().longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void test02() {
        assertEquals(6, new LongestPalindromeSubseq516().longestPalindromeSubseq("abaabaa"));
    }

    @Test
    public void test03() {
        assertEquals(8, new LongestPalindromeSubseq516().longestPalindromeSubseq("baaaaabbab"));
    }

    @Test
    public void test04() {
        assertEquals(2, new LongestPalindromeSubseq516().longestPalindromeSubseq("cbbd"));
    }
}