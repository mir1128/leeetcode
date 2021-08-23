package com.looboo.algorithm.luogu.list02;

import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

public class P1104Test {
    @Test
    public void test01() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("P1104/P1104_5.in");
        Scanner scanner = new Scanner(inputStream);

        P1104.ClassMate[] solve = P1104.solve(scanner);

        InputStream inputStream1 = this.getClass().getClassLoader().getResourceAsStream("P1104/P1104_5.out");
        Scanner scanner1 = new Scanner(inputStream1);

        String[] expected = new String[solve.length];
        for (int i = 0; i < solve.length; i++) {
            expected[i] = scanner1.next();
        }

        String[] strings = Arrays.stream(solve).map(P1104.ClassMate::getName).toArray(String[]::new);

        assertArrayEquals(expected, strings);

    }
}