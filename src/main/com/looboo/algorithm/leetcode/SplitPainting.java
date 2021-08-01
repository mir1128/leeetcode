package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitPainting {
    public List<List<Long>> splitPainting(int[][] segments) {

        int max = segments[0][1];
        int min = segments[0][0];

        for (int i = 1; i < segments.length; i++) {
            min = Math.min(segments[i][0], min);
            max = Math.max(segments[i][1], max);
        }

        int[] res = new int[max + 1];

        for (int i = 0; i < segments.length; i++) {
            res[segments[i][0]] += segments[i][2];
            res[segments[i][1]] -= segments[i][2];
        }

        int[] a = new int[max + 1];
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
            a[i] = sum;
        }

        List<List<Long>> result = new ArrayList<>();

        int start = a[min];
        int index = min;
        for (int i = min; i < a.length; i++) {
            if (a[i] != start) {
                result.add(Arrays.asList((long)index, (long)i, (long)start));
                start = a[i];
                index = i;
            }
        }

        return result;
    }
}
