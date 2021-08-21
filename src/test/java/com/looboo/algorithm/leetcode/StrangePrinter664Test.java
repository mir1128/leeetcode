package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrangePrinter664Test {
    @Test
    public void test01() {
        assertEquals(2, new StrangePrinter664().strangePrinter("aaabbb"));
    }

    @Test
    public void test02() {
        assertEquals(2, new StrangePrinter664().strangePrinter("aba"));
    }
}