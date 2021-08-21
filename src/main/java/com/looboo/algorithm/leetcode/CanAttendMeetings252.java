package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CanAttendMeetings252 {
    public boolean canAttendMeetings(int[][] intervals) {

        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            pairs.add(new Pair(intervals[i][0], intervals[i][1]));
        }

        List<Pair> collect = pairs.stream().sorted(Comparator.comparingInt(p -> p.start)).collect(Collectors.toList());

        Pair p = collect.get(0);
        for (int i = 1; i < collect.size(); i++) {
            if (p.end > collect.get(i).start) {
                return false;
            }
            p = collect.get(i);
        }

        return true;
    }

    private static class Pair {
        public int start;
        public int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
