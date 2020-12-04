package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReorganizeString767Test {
    @Test
    public void test01() {
        assertEquals("aba", new ReorganizeString767().reorganizeString("aab"));
    }

    @Test
    public void test02() {
        assertEquals("", new ReorganizeString767().reorganizeString("aaab"));
    }

    @Test
    public void test03() {
        assertEquals("", new ReorganizeString767().reorganizeString("kkkkzrkatkwpkkkktrq"));
    }
}