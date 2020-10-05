package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class AlertNames {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, PriorityQueue<Integer>> map = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            if (!map.containsKey(keyName[i])) {
                map.put(keyName[i], new PriorityQueue<>());
            }
            map.get(keyName[i]).add(toInt(keyTime[i]));
        }

        return map.entrySet().stream()
                .filter(e -> overRecorded(e.getValue()))
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(e -> e.getKey()).collect(Collectors.toList());
    }

    private boolean overRecorded(PriorityQueue<Integer> value) {
        List<Integer> integers = toList(value);
        if (integers.size() < 3) return false;

        for (int i = 0; i < integers.size() - 2; i++) {
            if (Math.abs(integers.get(i) - integers.get(i+1)) <= 60
                    && Math.abs(integers.get(i) - integers.get(i+2)) <= 60) {
                return true;
            }
        }
        return false;
    }

    private int toInt(String keyTime) {
        String[] split = keyTime.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

    private List<Integer> toList(PriorityQueue<Integer> queue) {
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }
}
