package com.looboo.algorithm.luogu.list02;

import com.looboo.algorithm.generate.Generator;
import com.looboo.algorithm.template.QuickSort;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class P1177Test {
    /*
    @Test
    public void test01() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("P1177/P1177_3.in");

        Scanner scanner = new Scanner(inputStream);
        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        QuickSort.quickSort1(input);

        InputStream inputStream1 = this.getClass().getClassLoader().getResourceAsStream("P1177/P1177_3.out");
        String s1 = new String(inputStream1.readAllBytes());
        int[] output = Arrays.stream(s1.split(" ")).mapToInt(Integer::parseInt).toArray();

        assertArrayEquals(output, input);
    }

    @Test
    public void test02() {
        int[] ints = Generator.generateRandomArray(1000, 0, 5000);

        QuickSort.quickSort1(ints);

        assertTrue(Generator.isSorted(ints));
    }

    @Test
    public void test03() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("P1177/P1177_4.in");

        assert inputStream != null;
        Scanner scanner = new Scanner(inputStream);
        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        QuickSort.quickSort1(input);

        InputStream inputStream1 = this.getClass().getClassLoader().getResourceAsStream("P1177/P1177_4.out");
        assert inputStream1 != null;
        String s1 = new String(inputStream1.readAllBytes());
        int[] output = Arrays.stream(s1.split(" ")).mapToInt(Integer::parseInt).toArray();

        assertArrayEquals(output, input);
    }

     */
}