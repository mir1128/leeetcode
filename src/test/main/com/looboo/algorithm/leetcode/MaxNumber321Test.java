package com.looboo.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaxNumber321Test {

    @Test
    public void merge1() {

        List<Integer> result = new MaxNumber321().merge1(Arrays.asList(9, 1, 2), Arrays.asList(9, 1, 4, 5));

        Assert.assertArrayEquals(new int[]{9, 9, 1, 4, 5, 1, 2}, result.stream().mapToInt(i -> i).toArray());
    }
}