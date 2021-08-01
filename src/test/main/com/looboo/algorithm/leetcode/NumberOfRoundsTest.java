package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfRoundsTest {
    @Test
    public void test01() {
        assertEquals(1, new NumberOfRounds().numberOfRounds("12:01","12:44"));
    }

    @Test
    public void test02() {
        assertEquals(40, new NumberOfRounds().numberOfRounds("20:00","06:00"));
    }

    @Test
    public void test03() {
        assertEquals(95, new NumberOfRounds().numberOfRounds("00:00","23:59"));
    }
}