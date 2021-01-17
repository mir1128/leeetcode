package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToTitle168Test {

    @Test
    public void test01() {
        assertEquals("Z", new ConvertToTitle168().convertToTitle(26));
    }

    @Test
    public void test02() {
        assertEquals("AB", new ConvertToTitle168().convertToTitle(28));
    }

    @Test
    public void test03() {
        assertEquals("ZY", new ConvertToTitle168().convertToTitle(701));
    }
}