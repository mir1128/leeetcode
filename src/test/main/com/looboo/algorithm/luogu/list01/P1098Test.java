package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.*;

public class P1098Test {
    @Test
    public void test01() {
        String str = "1 2 1\n" +
                "abcs-w1234-9s-4zz\n";
        InputStream inputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));

        String result = P1098.solve(new Scanner(inputStream));

        assertEquals("abcsttuuvvw1234556677889s-4zz", result);
    }

    @Test
    public void test02() {
        String str = "2 3 2\n" +
                "a-d-d\n";
        InputStream inputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));

        String result = P1098.solve(new Scanner(inputStream));

        assertEquals("aCCCBBBd-d", result);
    }

    @Test
    public void test03() {
        String str = "1 5 1\n" +
                "-254-243-52-345-243-5234-52-345-234-52-345-234-52345-4325-2345-2345-2345\n";

        InputStream inputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));

        String result = P1098.solve(new Scanner(inputStream));

        assertEquals("-254-2434444452345-24344444523452345-23452345-23452345-4325-2345-2345-2345", result);
    }

    @Test
    public void test04() {
        String str = "1 5 1\n" +
                "254-243-52-345-243-5234-52-345-234-52-345-234-52345-4325-2345-2345-2345-\n";

        InputStream inputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));

        String result = P1098.solve(new Scanner(inputStream));

        assertEquals("254-2434444452345-24344444523452345-23452345-23452345-4325-2345-2345-2345-", result);
    }
}