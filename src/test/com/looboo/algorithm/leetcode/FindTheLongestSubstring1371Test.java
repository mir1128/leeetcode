package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheLongestSubstring1371Test {

    @Test
    public void test01() {
        String s = "eleetminicoworoep";
        assertEquals(13, new FindTheLongestSubstring1371().findTheLongestSubstring(s));
    }

    @Test
    public void test02() {
        String s = "leetcodeisgreat";
        assertEquals(5, new FindTheLongestSubstring1371().findTheLongestSubstring(s));
    }

    @Test
    public void test03() {
        String s = "bcbcbc";
        assertEquals(6, new FindTheLongestSubstring1371().findTheLongestSubstring(s));
    }
}