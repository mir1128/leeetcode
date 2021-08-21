package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChange322Test {
    @Test
    public void test01() {
        assertEquals(3, new CoinChange322().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test02() {
        assertEquals(-1, new CoinChange322().coinChange(new int[]{2}, 3));
    }

    @Test
    public void test03() {
        assertEquals(0, new CoinChange322().coinChange(new int[]{1}, 0));
    }

    @Test
    public void test04() {
        assertEquals(1, new CoinChange322().coinChange(new int[]{1}, 1));
    }

    @Test
    public void test05() {
        assertEquals(2, new CoinChange322().coinChange(new int[]{1}, 2));
    }

    @Test
    public void test06() {
        assertEquals(20, new CoinChange322().coinChange(new int[]{186, 419, 83, 408}, 6249));
    }
}