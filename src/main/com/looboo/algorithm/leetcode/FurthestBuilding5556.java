package com.looboo.algorithm.leetcode;

import java.util.PriorityQueue;

public class FurthestBuilding5556 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int n = heights.length;

        for (int i = 0; i + 1 < n; i++) {
            if (heights[i + 1] > heights[i]) {
                priorityQueue.add(heights[i + 1] - heights[i]);

                if (priorityQueue.size() > ladders) {
                    bricks -= priorityQueue.poll();
                    if (bricks < 0) {
                        return i;
                    }
                }
            }
        }
        return n - 1;
    }
}
