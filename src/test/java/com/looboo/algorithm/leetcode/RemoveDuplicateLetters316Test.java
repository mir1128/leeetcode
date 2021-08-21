package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLetters316Test {

    @Test
    public void test01() {
        assertEquals("abc", new RemoveDuplicateLetters316().removeDuplicateLetters("bcabc"));

    }

    @Test
    public void test02() {
        assertEquals("acdb", new RemoveDuplicateLetters316().removeDuplicateLetters("cbacdcbc"));
    }

    @Test
    public void test03() {
        assertEquals("abc", new RemoveDuplicateLetters316().removeDuplicateLetters("abacb"));
    }

}