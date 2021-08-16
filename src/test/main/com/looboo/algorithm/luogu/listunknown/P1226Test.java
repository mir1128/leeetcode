package com.looboo.algorithm.luogu.listunknown;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1226Test {
    @Test
    public void test01() {

        long l = P1226.fastPower(4523, 59, 7762);
        assertEquals(6275, l);
    }

    @Test
    public void test02() {
        long l = P1226.fastPower(2547862, 87432, 44169);
        assertEquals(31108, l);
    }
}