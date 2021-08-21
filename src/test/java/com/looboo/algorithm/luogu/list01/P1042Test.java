package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class P1042Test {
    @Test
    public void test01() {
        List<String> result = P1042.solve("WWWWWWWWWWWWWWWWWWWWWWLWE");

        result.forEach(System.out::println);
    }

    @Test
    public void name() throws IOException {
        InputStream inputStream = P1042.class.getClassLoader().getResourceAsStream("p1042/P1042_10.in");

        String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        List<String> solve = P1042.solve(text);

        solve.forEach(System.out::println);
    }

    @Test
    public void test02() {
        List<String> result = P1042.solve("WWWWWWWWWWWEadfadf;jadf");
        System.out.println(result);
    }
}