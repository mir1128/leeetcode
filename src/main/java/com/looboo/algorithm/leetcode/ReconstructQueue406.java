package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructQueue406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> p1[0] == p2[0] ? p1[1] - p2[1] : p2[0] - p1[0]);

        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            result.add(people[i][1], people[i]);
        }

        return result.toArray(new int[people.length][2]);
    }
}
