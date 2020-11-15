package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderedStream5601Test {
    @Test
    public void test01() {
        OrderedStream5601 orderedStream5601 = new OrderedStream5601(5);
        List<String> ccccc = orderedStream5601.insert(3, "ccccc");
        ccccc = orderedStream5601.insert(1, "aaaaa");
        ccccc = orderedStream5601.insert(2, "bbbbb");
        ccccc = orderedStream5601.insert(5, "eeeee");
        ccccc = orderedStream5601.insert(4, "ddddd");

    }
}