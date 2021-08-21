package com.looboo.algorithm.luogu.list01;

import org.junit.Test;

import static org.junit.Assert.*;
public class P1045Test {
    @Test
    public void test01() {
        String s = "2";
        System.out.print(padLeftZeros("a", 5));
    }

    public static String padLeftSpaces(String str, int n) {
        return String.format("%1$" + n + "s", str);
    }

    public static String padLeftZeros(String str, int n) {
        return String.format("%1$" + n + "s", str).replace(' ', '0');
    }
}