package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class VideoStitching1024Test {

    @Test
    public void test01() {
        int[][] arr = Utils.intArray2d("[[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]]");
        assertEquals(3, new VideoStitching1024().videoStitching(arr, 10));
    }

    @Test
    public void test02() {
        int[][] arr = Utils.intArray2d("[[0,1],[1,2]]");
        assertEquals(-1, new VideoStitching1024().videoStitching(arr, 10));
    }

    @Test
    public void test03() {
        int[][] arr = Utils.intArray2d("[[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]]");
        assertEquals(3, new VideoStitching1024().videoStitching(arr, 9));
    }

    @Test
    public void test04() {
        int[][] ints = Utils.intArray2d("[[0,2],[4,8]]");
        assertEquals(-1, new VideoStitching1024().videoStitching(ints, 5));
    }


    @Test
    public void test05() {
        String s = "[[10,25],[2,99],[65,66],[1,96],[6,93],[2,57],[17,55],[72,89],[7,48],[59,99],[92,97],[80,91],[21,93],[54,59],[23,65],[20,36],[76,80],[9,74],[67,70],[12,47],[23,56],[40,58],[8,88],[24,53],[0,34],[80,88],[16,97],[23,40],[7,25],[10,16],[22,24],[57,100],[58,67],[63,82],[15,56],[11,47],[3,72],[36,82],[43,71],[16,18],[0,71],[70,79],[9,46],[43,53],[5,72],[72,77],[66,72],[45,84],[4,90],[17,51],[1,91],[55,62],[13,73],[2,95],[30,65],[80,82],[70,96],[7,92],[94,98],[24,41],[45,71],[21,91],[1,4],[29,88],[59,97],[52,73],[22,39],[52,69],[19,67],[45,77],[63,67],[39,47],[13,69],[28,79],[20,95],[4,26],[23,28],[38,100],[63,76],[1,6],[53,59],[9,44],[54,56],[60,92],[63,84],[14,93],[25,27],[2,84],[57,89],[55,61]]";
        int[][] ints = Utils.intArray2d(s);
        assertEquals(2, new VideoStitching1024().videoStitching(ints, 80));
    }

}