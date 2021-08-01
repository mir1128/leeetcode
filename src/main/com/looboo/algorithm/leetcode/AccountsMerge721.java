package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class AccountsMerge721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < accounts.size(); i++) {

            Map<String, Integer> temp = new HashMap<>();

            List<String> strings = accounts.get(i);
            for (int j = 1; j < strings.size(); j++) {
                if (!map.containsKey(strings.get(j))) {
                    temp.put(strings.get(j), i);
                } else {
                    temp.clear();
                    int n = map.get(strings.get(j));
                    for (int k = 1; k < strings.size(); k++) {
                        map.put(strings.get(k), n);
                    }
                    break;
                }
            }
            if (!temp.isEmpty()) {
                map.putAll(temp);
            }
        }

        Map<Integer, PriorityQueue<String>> targetMap = new HashMap<>();
        for (String s : map.keySet()) {
            Integer integer = map.get(s);
            targetMap.compute(integer, (k, v) -> v == null ? new PriorityQueue<>() : v).add(s);
        }

        List<List<String>> result = new ArrayList<>();

        for (Integer integer : targetMap.keySet()) {
            List<String> list = new ArrayList<>();
            list.add(accounts.get(integer).get(0));
            PriorityQueue<String> priorityQueue = targetMap.get(integer);
            while (!priorityQueue.isEmpty()) {
                list.add(priorityQueue.poll());
            }
            result.add(list);
        }

        return result;
    }
}
