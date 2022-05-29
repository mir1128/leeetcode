package com.looboo.algorithm.math;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ComputeTest {
    @Test
    public void test01() {
        Compute compute = new Compute();
//        compute.compute(new int[]{1, 2}, 3);
        List<String> result = compute.getResult();
    }
}