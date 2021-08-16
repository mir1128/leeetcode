package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;

public class LongestObstacleCourseAtEachPosition {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {

        int[] dp = new int[obstacles.length];

        dp[0] = 1;

        for (int i = 1; i < obstacles.length; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (obstacles[i] >= obstacles[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        return dp;
    }

    public int[] longestObstacleCourseAtEachPosition1(int[] obstacles) {

        int[] dp = new int[obstacles.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < obstacles.length; i++) {
            int index = upper_bound(list, obstacles[i]);
            if (index == -1) {
                dp[i] = list.size() + 1;
                list.add(obstacles[i]);
            } else {
                dp[i] = index + 1;
                list.set(index, obstacles[i]);
            }
        }

        return dp;
    }

    private int upper_bound(List<Integer> list, int obstacle) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) <= obstacle) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (left == right && list.get(left) > obstacle) {
            return left;
        }
        return -1;
    }
}
