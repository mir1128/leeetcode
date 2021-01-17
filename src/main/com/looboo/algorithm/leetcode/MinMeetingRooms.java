package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinMeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (!priorityQueue.isEmpty() && priorityQueue.peek() <= intervals[i][0]) {
                priorityQueue.poll();
            }
            priorityQueue.offer(intervals[i][1]);
        }

        return priorityQueue.size();
    }
}
