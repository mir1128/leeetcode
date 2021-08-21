package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class IsPossible659 {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int x : nums) {
            if (!map.containsKey(x)) {
                map.put(x, new PriorityQueue<>());
            }
            if (map.containsKey(x - 1)) {
                int prevLength = map.get(x - 1).poll();
                if (map.get(x - 1).isEmpty()) {
                    map.remove(x - 1);
                }
                map.get(x).offer(prevLength + 1);
            } else {
                map.get(x).offer(1);
            }
        }

        Set<Map.Entry<Integer, PriorityQueue<Integer>>> entrySet = map.entrySet();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : entrySet) {
            PriorityQueue<Integer> queue = entry.getValue();
            if (queue.peek() < 3) {
                return false;
            }
        }
        return true;
    }

    public boolean isPossible1(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> length = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (count.get(nums[i]) > 0) {
                if (length.containsKey(nums[i] - 1)) {
                    int cnt = length.get(nums[i] - 1);
                    if (cnt == 1) length.remove(nums[i] - 1);
                    length.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
                    count.compute(nums[i], (k, v) -> v - 1);
                } else {
                    if (count.containsKey(nums[i] + 1) && count.get(nums[i] + 1) > 0
                            && count.containsKey(nums[i] + 2) && count.get(nums[i] + 2) > 0) {
                        length.compute(nums[i] + 2, (k, v) -> v == null ? 1 : v + 1);
                        count.compute(nums[i], (k, v) -> v - 1);
                        count.compute(nums[i] + 1, (k, v) -> v - 1);
                        count.compute(nums[i] + 2, (k, v) -> v - 1);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}