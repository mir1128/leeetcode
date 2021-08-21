package com.looboo.algorithm.template;

import com.looboo.algorithm.generate.Generator;
import com.looboo.algorithm.utils.StopWatch;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {


    private static final int magnitude10w = 10_0000;
    private static final int magnitude100w = 100_0000;
    private static final int magnitude1000w = 1_000_0000;

    @Test
    public void testQuickSort() {
        int[] arr = {4, 2, 4, 5, 1};

        QuickSort.quickSort1(arr);

        assertArrayEquals(new int[]{1, 2, 4, 4, 5}, arr);
    }

    @Test
    public void performanceTestQuickSort1() {
        int[] ints1 = Generator.generateRandomArray(magnitude100w, 0, 500_0000);

        StopWatch watch = StopWatch.startWatch();

        QuickSort.quickSort1(ints1);

        watch.stop();
    }


    @Test
    public void testQuickSort2() {
        int[] arr = {4, 2, 4, 5, 1};

        QuickSort.quickSort2ways(arr);

        assertArrayEquals(new int[]{1, 2, 4, 4, 5}, arr);
    }


    @Test
    public void testQuickSort3Ways() {
        int[] arr = {4, 2, 4, 5, 1};

        QuickSort.quickSort3ways(arr);

        assertArrayEquals(new int[]{1, 2, 4, 4, 5}, arr);
    }

    @Test
    public void performanceTest() {
        int[] ints1 = Generator.generateRandomArray(magnitude100w, 0, 500_0000);

        StopWatch watch = StopWatch.startWatch();

        QuickSort.quickSort1(ints1);

        watch.stop();
    }

    @Test
    public void performanceTest02() {
        int[] ints1 = Generator.generateRandomArray(magnitude100w, 0, 500_0000);

        StopWatch watch = StopWatch.startWatch();

        QuickSort.quickSort2ways(ints1);

        watch.stop();
    }

    @Test
    public void performanceTest03() {
        int[] ints1 = Generator.generateRandomArray(magnitude100w, 0, 500_0000);

        StopWatch watch = StopWatch.startWatch();

        QuickSort.quickSort3ways(ints1);

        watch.stop();
    }
}

