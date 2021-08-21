package com.looboo.algorithm.template;

import com.looboo.algorithm.generate.Generator;
import com.looboo.algorithm.utils.StopWatch;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void test01() {
        int[] ints = Generator.generateRandomArray(10000, 0, 500000);

        StopWatch watch = StopWatch.startWatch();
        MergeSort.mergeSort(ints);
        watch.stop();

        assertTrue(Generator.isSorted(ints));

    }
}