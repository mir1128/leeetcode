package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumHammingDistance5650Test {
    @Test
    public void test01() {
        assertEquals(1, new MinimumHammingDistance5650().minimumHammingDistance(Utils.intArray1d("[1,2,3,4]"), Utils.intArray1d("[2,1,4,5]"), Utils.intArray2d("[[0,1],[2,3]]")));
    }

    @Test
    public void test02() {
        assertEquals(2, new MinimumHammingDistance5650().minimumHammingDistance(Utils.intArray1d("[1,2,3,4]"), Utils.intArray1d("[1,3,2,4]"), new int[][]{}));
    }

    @Test
    public void test03() {
        assertEquals(0, new MinimumHammingDistance5650().minimumHammingDistance(Utils.intArray1d("[5,1,2,4,3]"), Utils.intArray1d("[1,5,4,2,3]"), Utils.intArray2d("[[0,4],[4,2],[1,3],[1,4]]")));
    }

    @Test
    public void test04() {
        int[] ints = Utils.intArray1d("[49,21,79,79,6,67,78,9,91,39,49,32,53,29,97,50,82,55,13,83,63,99,41,6,51,46,31,26,58,18,32,51,44,66,40,35,96,20,35,43,64,96,99,76,11,35,86,96,10,19,70,29,19,47]");
        int[] ints1 = Utils.intArray1d("[33,22,32,71,66,90,78,67,74,76,84,32,25,100,57,7,90,95,33,79,54,99,42,6,32,55,31,14,58,67,48,59,7,50,5,22,11,97,94,14,53,75,3,9,82,74,86,27,21,77,70,29,65,15]");
        int[][] ints2 = Utils.intArray2d("[[40,41],[41,35],[18,19],[9,51],[48,2],[45,13],[27,45],[16,22],[23,25],[2,6],[5,11],[37,38],[22,48],[13,48],[51,37],[24,19],[2,32],[38,23],[33,34],[37,44],[31,8],[4,26],[34,35],[37,28],[48,34],[27,0],[23,37],[17,29],[38,7],[37,31],[34,42],[26,20],[22,45],[26,29],[40,42],[48,30],[46,49],[12,52],[49,28],[39,14],[23,34],[6,30],[18,12],[52,49],[21,18],[11,4],[2,7],[4,17],[19,27],[33,5],[44,28],[38,9],[34,7],[7,47],[37,13],[51,12],[42,53],[42,21],[18,9],[21,39],[4,33],[29,39],[47,41],[25,13],[50,0],[21,48],[32,27],[33,53],[39,5],[12,25],[52,6],[17,44],[16,52],[0,34],[14,29],[0,19],[13,7],[29,21],[9,22],[28,45],[1,29],[37,17],[38,36],[4,23],[38,21],[35,5],[2,16],[34,30],[37,16],[40,53],[51,47],[20,32],[7,9],[12,15],[26,0],[14,44],[53,11],[48,17]]");

        assertEquals(34, new MinimumHammingDistance5650().minimumHammingDistance(ints, ints1, ints2));
    }
}