package com.looboo.algorithm.leetcode;

public class NumberOfRounds {
    public int numberOfRounds(String startTime, String finishTime) {

        int start = minutes(startTime);
        int finish = minutes(finishTime);

        int last = start <= finish ? finish - start : (24 * 60 - start) + finish;

        last = last - (start % 15 == 0 ? 0 : (15 - start % 15));

        return last / 15;
    }

    private int minutes(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}
