package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WordBreak139Test {
    @Test
    public void test01() {
        assertTrue(new WordBreak139().wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void test02() {
        assertTrue(new WordBreak139().wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void test03() {
        assertFalse(new WordBreak139().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

}