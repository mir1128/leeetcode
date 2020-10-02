package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class CorpFlightBookings1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] count = new int[n + 1];

        for (int i = 0; i < bookings.length; i++) {
            count[bookings[i][0]] += bookings[i][2];
            if (bookings[i][1] + 1 < n) count[bookings[i][1] + 1] -= bookings[i][2];
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        return Arrays.copyOfRange(count, 1, n + 1);
    }
}
