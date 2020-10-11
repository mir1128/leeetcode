package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximalNetworkRank5536 {
    public int maximalNetworkRank(int n, int[][] roads) {

        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < roads.length; i++) {
            if (adj.containsKey(roads[i][0])) {
                adj.get(roads[i][0]).add(roads[i][1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(roads[i][1]);
                adj.put(roads[i][0], list);
            }

            if (adj.containsKey(roads[i][1])) {
                adj.get(roads[i][1]).add(roads[i][0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(roads[i][0]);
                adj.put(roads[i][1], list);
            }
        }

        List<Map.Entry<Integer, List<Integer>>> collect = new ArrayList<>(adj.entrySet());

        if (collect.size() < 2) return 0;

        int max = 0;

        for (int i = 0; i < collect.size()-1; i++) {
            Map.Entry<Integer, List<Integer>> cur = collect.get(i);
            for (int j = i+1; j < collect.size(); j++) {
                int tmp = 0;
                if (cur.getValue().contains(collect.get(j).getKey())) {
                    tmp = cur.getValue().size() + collect.get(j).getValue().size() - 1;
                } else {
                    tmp = cur.getValue().size() + collect.get(j).getValue().size();
                }

                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }
}
