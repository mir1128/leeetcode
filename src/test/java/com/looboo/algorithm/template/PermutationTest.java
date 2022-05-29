package com.looboo.algorithm.template;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class PermutationTest {
    @Test
    public void test01() {
        List<List<Integer>> result = Permutation.permute(new int[]{1, 2, 3}, 3);

        assertEquals(27, result.size());
        result.forEach(System.out::println);
    }

    @Test
    public void test02() {
        List<List<Integer>> result = Permutation.permute(new int[]{1, 2, 3, 4}, 3);

        result.forEach(System.out::println);
    }

    @Test
    public void test03() {
        List<List<Integer>> result = Permutation.permuteNoRepeat(new int[]{1, 2, 3, 4}, 3);

        result.forEach(System.out::println);
    }

    @Test
    public void test04() {
        Integer[] integers = Permutation.nextPermutation(new Integer[]{1, 2, 3}, Integer::compare);
        assertArrayEquals(new Integer[]{1, 3, 2}, integers);
    }

    @Test
    public void test05() {
        Integer[] integers = Permutation.nextPermutation(new Integer[]{1, 2, 3, 9, 8, 6, 7, 4, 5}, Integer::compare);
        assertArrayEquals(new Integer[]{1, 2, 3, 9, 8, 6, 7, 5, 4}, integers);
    }

    @Test
    public void test06() {
        Integer[] integers = Permutation.prePermutation(new Integer[]{1, 3, 2}, Integer::compare);
        assertArrayEquals(new Integer[]{1, 2, 3}, integers);
    }
}