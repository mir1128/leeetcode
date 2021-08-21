package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class P1601Test {
    @Test
    public void test01() {
        String s = "1001\n" +
                "9099\n";
        Scanner scanner = new Scanner(s);

        String solve = P1601.solve(scanner);

        assertEquals("10100", solve);
    }

    @Test
    public void test02() {
        String s = "00000\n" +
                "000000\n";
        Scanner scanner = new Scanner(s);

        String solve = P1601.solve(scanner);

        assertEquals("0", solve);
    }
}