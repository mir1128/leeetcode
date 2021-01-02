package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountSubstrings647Test {
    @Test
    public void test01() {
        assertEquals(3, new CountSubstrings647().countSubstrings("abc"));
        assertEquals(3, new CountSubstrings647().countSubstrings1("abc"));
    }

    @Test
    public void test02() {
        assertEquals(6, new CountSubstrings647().countSubstrings("aaa"));
        assertEquals(6, new CountSubstrings647().countSubstrings1("aaa"));
    }

    @Test
    public void test03() {
        String s = "dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg";
        assertEquals(77, new CountSubstrings647().countSubstrings(s));
        assertEquals(77, new CountSubstrings647().countSubstrings1(s));
    }
}