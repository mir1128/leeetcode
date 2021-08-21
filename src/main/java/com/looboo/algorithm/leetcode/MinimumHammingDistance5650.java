package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumHammingDistance5650 {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < allowedSwaps.length; i++) {
            if (map.containsKey(allowedSwaps[i][0]) && map.containsKey(allowedSwaps[i][1])) {
                map.get(allowedSwaps[i][0]).addAll(map.get(allowedSwaps[i][1]));

                for (Integer integer : map.get(allowedSwaps[i][1])) {
                    map.put(integer, map.get(allowedSwaps[i][0]));
                }
            } else if (map.containsKey(allowedSwaps[i][0]) && !map.containsKey(allowedSwaps[i][1])) {
                map.get(allowedSwaps[i][0]).add(allowedSwaps[i][1]);
                map.put(allowedSwaps[i][1], map.get(allowedSwaps[i][0]));
            } else if (!map.containsKey(allowedSwaps[i][0]) && map.containsKey(allowedSwaps[i][1])) {
                map.get(allowedSwaps[i][1]).add(allowedSwaps[i][0]);
                map.put(allowedSwaps[i][0], map.get(allowedSwaps[i][1]));
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(allowedSwaps[i][0]);
                set.add(allowedSwaps[i][1]);
                map.put(allowedSwaps[i][0], set);
                map.put(allowedSwaps[i][1], set);
            }
        }

        int res = 0;
        Set<Set<Integer>> sets = new HashSet<>(map.values());

        Set<Integer> remains = new HashSet<>();
        for (int i = 0; i < source.length; i++) {
            remains.add(i);
        }

            System.out.println(remains);

        for (Set<Integer> set : sets) {
            for (Integer integer : set) {
                remains.remove(integer);
            }
        }

        for (Integer remain : remains) {
            if (source[remain] != target[remain]) res++;
        }

        for (Set<Integer> set : sets) {
            Map<Integer, Integer> mapSource = new HashMap<>();
            for (Integer integer : set) {
                mapSource.compute(source[integer], (k, v) -> v == null ? 1 : v + 1);
            }

            System.out.println(set);

            for (Integer integer : set) {
                if (mapSource.containsKey(target[integer])) {
                    int a = mapSource.get(target[integer]) - 1;
                    if (a == 0) {
                        mapSource.remove(target[integer]);
                    }
                } else {
                    res++;
                }
            }
        }

        return res;
    }
}
