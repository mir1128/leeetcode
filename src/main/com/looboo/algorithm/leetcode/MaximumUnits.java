package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnits {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, Comparator.comparingInt(b -> -b[1]));

        int n = 0;
        int index = 0;
        int total = 0;
        while ( n < truckSize && index < boxTypes.length) {
            if (n + boxTypes[index][0] <= truckSize) {
                n += boxTypes[index][0];
                total += boxTypes[index][0] * boxTypes[index][1];
                index++;
            } else {
                total += (truckSize - n) * boxTypes[index][1];
                n = truckSize;
            }
        }

        return total;
    }
}
