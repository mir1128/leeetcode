package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MostCompetitiveTest {

    @Test
    public void test01() {
        int[] arr ={3,5,2,6};
        new MostCompetitive().mostCompetitive(arr, 2);
    }

    @Test
    public void test() {
        int [] arr = {2,4,3,3,5,4,9,6};
        new MostCompetitive().mostCompetitive(arr, 4);
    }
}