package com.looboo.algorithm.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighPrecisionTest {
    @Test
    public void testAdd() {
        assertEquals("24691357820", HighPrecision.add("12345678910", "12345678910"));
    }

    @Test
    public void testMul() {
        assertEquals("152415787748818788100", HighPrecision.mul("12345678910", "12345678910"));
    }

    @Test
    public void testTrim() {
        assertEquals("12345", HighPrecision.trim("00012345"));
    }

    @Test
    public void testSub() {
        assertEquals("12345678676", HighPrecision.sub("12345678910", "234"));
    }

    @Test
    public void testSub01() {
        assertEquals("-12345678676", HighPrecision.sub("234", "12345678910"));
    }

    @Test
    public void testSub02() {
        assertEquals("-1", HighPrecision.sub("12345678910", "12345678911"));
    }

    @Test
    public void testPower() {
        String ret = "676462977038539690931854578143714216743121249206181635174910782847493565599119369669868807853468286976";
        assertEquals(ret, HighPrecision.power("123456", 20));
    }

}