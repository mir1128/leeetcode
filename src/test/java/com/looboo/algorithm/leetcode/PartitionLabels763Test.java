package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PartitionLabels763Test {

    @Test
    public void test01() {
        List<Integer> list = new PartitionLabels763().partitionLabels("ababcbacadefegdehijhklij");
        assertArrayEquals(new int[]{9, 7, 8}, list.stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void test02() {
        List<Integer> list = new PartitionLabels763().partitionLabels("caedbdedda");
        assertArrayEquals(new int[]{1, 9}, list.stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void test03() {
        List<Integer> list = new PartitionLabels763().partitionLabels("qiejxqfnqceocmy");
        assertArrayEquals(new int[]{13, 1, 1}, list.stream().mapToInt(i -> i).toArray());
    }
}