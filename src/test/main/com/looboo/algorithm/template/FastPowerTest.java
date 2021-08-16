package com.looboo.algorithm.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class FastPowerTest {

    @Test
    public void fastPower1Test() {
        assertEquals(1024, FastPower.fastPower1(2, 10));
    }

    @Test
    public void fastPower2Test() {
        assertEquals(1024, FastPower.fastPower2(2, 10));
    }

    @Test
    public void fastPowerWithModTest() {
        assertEquals(7, FastPower.fastPowerWithMod(2 ,10 ,9));
    }
}