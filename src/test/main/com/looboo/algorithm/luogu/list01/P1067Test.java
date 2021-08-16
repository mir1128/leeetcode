package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class P1067Test {
    @Test
    public void test01() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("p1067/P1067_3.in");
        String solve = P1067.solve(new Scanner(inputStream));

        assertEquals("-x^99-7x^50+100x^2+x+8", solve);
    }

    @Test
    public void test02() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("p1067/P1067_2.in");
        String solve = P1067.solve(new Scanner(inputStream));

        assertEquals("x^3-100x^2", solve);
    }
}