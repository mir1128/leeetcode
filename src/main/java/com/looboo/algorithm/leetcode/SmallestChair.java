package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class SmallestChair {
    public int smallestChair(int[][] times, int targetFriend) {

        int[] target = new int[2];
        target[0] = times[targetFriend][0];
        target[1] = times[targetFriend][1];

        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));

        int[] b = new int[times.length];
        b[0] = times[0][1];

        int res = -1;
        for (int i = 0; i < times.length && times[i][0] <= target[0]; ++i) {
            int j = 0;
            for (; j < i; j++) {
                if (times[i][0] >= b[j]) {
                    b[j] = times[i][1];
                    res = j;
                    break;
                }
            }
            if (j == i) {
                b[i] = times[i][1];
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints = Utils.intArray2d("[[1,4],[2,3],[4,6]]");
        int i = new SmallestChair().smallestChair(ints, 1);

        int a = 0;
    }
}
