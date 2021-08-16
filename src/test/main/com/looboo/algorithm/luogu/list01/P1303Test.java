package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class P1303Test {

    @Test
    public void add() {
        assertEquals("101", P1303.add("100", "1"));
    }

    @Test
    public void test01() {
        String s = "104\n" +
                "103\n";
        String solve = P1303.solve(new Scanner(s));

        assertEquals("10712", solve);
    }

    @Test
    public void test02() {
        String s = "0\n" +
                "10\n";
        String solve = P1303.solve(new Scanner(s));

        assertEquals("0", solve);
    }
}