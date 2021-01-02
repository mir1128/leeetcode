package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValidWordSquare422Test {

    @Test
    public void test01() {
        List<String> strings = Arrays.asList("abcd", "bnrt", "crmy", "dtye");
        assertTrue(new ValidWordSquare422().validWordSquare(strings));
    }
}