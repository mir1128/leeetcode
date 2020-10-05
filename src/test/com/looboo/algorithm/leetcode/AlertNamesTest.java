package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AlertNamesTest {

    @Test
    public void test01() {
        String [] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String [] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};
        assertEquals(Arrays.asList("daniel"), new AlertNames().alertNames(keyName, keyTime));
    }

    @Test
    public void test02() {
        String [] keyName = {"leslie","leslie","leslie","clare","clare","clare","clare"};
        String [] keyTime = {"13:00","13:20","14:00","18:00","18:51","19:30","19:49"};
        assertEquals(Arrays.asList("clare","leslie"), new AlertNames().alertNames(keyName, keyTime));
    }
}