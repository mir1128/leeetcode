package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsCount1067Test {
    @Test
    public void test01() {
        assertEquals(6, new DigitsCount1067().digitsCount(1,1,13));
    }

    @Test
    public void test02() {
        assertEquals(35, new DigitsCount1067().digitsCount(3,100,250));
    }

    @Test
    public void test03() {
        assertEquals(3651, new DigitsCount1067().digitsCount(3,1,32845));
    }
}