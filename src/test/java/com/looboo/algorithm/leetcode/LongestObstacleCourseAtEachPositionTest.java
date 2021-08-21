package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class LongestObstacleCourseAtEachPositionTest {
    @Test
    public void test01() {
        int[] ints = new LongestObstacleCourseAtEachPosition().longestObstacleCourseAtEachPosition1(Utils.intArray1d("[1,2,3,2]"));

        Utils.print(ints);
        assertArrayEquals(new int[]{1, 2, 3, 3}, ints);
    }

    @Test
    public void test02() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("longestobstacle.txt");
        String s = new String(inputStream.readAllBytes());


        int[] ints = Utils.intArray1d(s);

        int[] ints1 = new LongestObstacleCourseAtEachPosition().longestObstacleCourseAtEachPosition1(ints);
    }

    @Test
    public void test03() {
        int[] ints = new LongestObstacleCourseAtEachPosition().longestObstacleCourseAtEachPosition1(Utils.intArray1d("[3,1,5,6,4,2]"));

        Utils.print(ints);

        assertArrayEquals(new int[]{1,1,2,3,2,2}, ints);
    }

    @Test
    public void test04() {
        int[] ints = new LongestObstacleCourseAtEachPosition().longestObstacleCourseAtEachPosition1(Utils.intArray1d("[2,2,1]"));

        Utils.print(ints);

        assertArrayEquals(new int[]{1,2,1}, ints);
    }

    @Test
    public void test05() {
        int[] ints1 = Utils.intArray1d("[5,1,5,5,1,3,4,5,1,4]");
        int[] ints2 = Utils.intArray1d("[1,1,2,3,2,3,4,5,3,5]");

        int[] ints = new LongestObstacleCourseAtEachPosition().longestObstacleCourseAtEachPosition1(ints1);

        Utils.print(ints);
        assertArrayEquals(ints2, ints);
    }


    @Test
    public void test06() {
        System.out.println(String.format("%1$020x", 32, "Hello"));
    }
}