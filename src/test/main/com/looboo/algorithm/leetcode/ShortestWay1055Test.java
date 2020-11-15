package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestWay1055Test {
    @Test
    public void test01() {
        assertEquals(2, new ShortestWay1055().shortestWay("abc", "abcbc"));
    }

    @Test
    public void test02() {
        assertEquals(3, new ShortestWay1055().shortestWay("aaaaa", "aaaaaaaaaaaaa"));
    }
}