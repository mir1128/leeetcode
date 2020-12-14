package com.looboo.algorithm.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class FaceTheRightWayPoj3276Test {
    @Test
    public void test01() {
        assertArrayEquals(new int[]{3, 3}, new FaceTheRightWayPoj3276().faceTheRightWay("BBFBFBB".toCharArray()));
    }
}