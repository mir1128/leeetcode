package com.looboo.algorithm.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StoneGameVI {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> -a[0]));

        for (int i = 0; i < aliceValues.length; i++) {
            queue.add(new int[]{aliceValues[i] + bobValues[i], i});
        }

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < aliceValues.length; i++) {
            int[] poll = queue.poll();
            if (i % 2 == 0) {
                alice += aliceValues[poll[1]];
            } else {
                bob += bobValues[poll[1]];
            }
        }

        if (alice > bob) return 1;
        if (alice < bob) return -1;
        return 0;
    }


}
