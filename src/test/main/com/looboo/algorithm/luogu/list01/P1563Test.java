package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class P1563Test {
    @Test
    public void test01() {
        String s = "7 3\n" +
                "0 singer\n" +
                "0 reader\n" +
                "0 mengbier \n" +
                "1 thinker\n" +
                "1 archer\n" +
                "0 writer\n" +
                "1 mogician \n" +
                "0 3\n" +
                "1 1\n" +
                "0 2\n";

        String solve = P1563.solve(new Scanner(s));

        assertEquals("writer", solve);
    }

    @Test
    public void test02() {
        String s = "10 10\n" +
                "1 C\n" +
                "0 r\n" +
                "0 P\n" +
                "1 d\n" +
                "1 e\n" +
                "1 m\n" +
                "1 t\n" +
                "1 y\n" +
                "1 u\n" +
                "0 V\n" +
                "1 7\n" +
                "1 1\n" +
                "1 4\n" +
                "0 5\n" +
                "0 3\n" +
                "0 1\n" +
                "1 6\n" +
                "1 2\n" +
                "0 8\n" +
                "0 4\n";

        String solve = P1563.solve(new Scanner(s));

        assertEquals("y", solve);
    }
}