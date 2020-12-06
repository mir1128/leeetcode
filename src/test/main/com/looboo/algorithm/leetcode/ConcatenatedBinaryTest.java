package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenatedBinaryTest {
    @Test
    public void test01() {
        assertEquals(505379714, new ConcatenatedBinary().concatenatedBinary(12));
    }

    @Test
    public void test02() {
        assertEquals(27, new ConcatenatedBinary().concatenatedBinary(3));
    }

    @Test
    public void test03() {
        assertEquals(727837408, new ConcatenatedBinary().concatenatedBinary(42));
    }
}