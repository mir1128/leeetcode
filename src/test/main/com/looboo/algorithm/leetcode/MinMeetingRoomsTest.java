package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMeetingRoomsTest {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[5,8],[6,8]]");
        assertEquals(2, new MinMeetingRooms().minMeetingRooms(ints));
    }

    @Test
    public void test02() {
        int[][] ints = Utils.intArray2d("[[0,30],[5,10],[15,20]]");
        assertEquals(2, new MinMeetingRooms().minMeetingRooms(ints));
    }

    @Test
    public void test03() {
        int[][] ints = Utils.intArray2d("[[7,10],[2,4]]");
        assertEquals(1, new MinMeetingRooms().minMeetingRooms(ints));
    }
}