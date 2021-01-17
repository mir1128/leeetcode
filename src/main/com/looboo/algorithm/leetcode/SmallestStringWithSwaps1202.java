package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SmallestStringWithSwaps1202 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        int[] parent = new int[n];

        //初始化根节点，为自己
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        //合并，创建圈子关系
        for (int j = 0; j < pairs.size(); j++) {
            List<Integer> pa = pairs.get(j);
            int pre = pa.get(0);
            int aft = pa.get(1);

            int preP = findParent(pre, parent);
            int aftP = findParent(aft, parent);
            if (preP == aftP) {
                continue;
            }

            parent[preP] = aftP;
        }

        //存map里，根节点做key,建小堆
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for (int k = 0; k < n; k++) {
            PriorityQueue<Character> queue = map.getOrDefault(findParent(k, parent), new PriorityQueue<>());
            queue.offer(s.charAt(k));
            map.put(parent[k], queue);
        }

        //依次寻找，输出结果
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < n; r++) {
            PriorityQueue<Character> tq = map.get(findParent(r, parent));
            sb.append(tq.poll());
        }

        return sb.toString();
    }

    //注意，这里每次找最高父节点用此方法，直接指向根节点，
    //不能用下标直接去parent数组找，因为map里存的是根节点
    int findParent(int x, int[] parent) {
        if (x != parent[x]) {
            parent[x] = findParent(parent[x], parent);
        }

        return parent[x];
    }
}
