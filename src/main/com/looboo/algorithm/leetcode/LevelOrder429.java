package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class LevelOrder429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<Node> layer = new LinkedList<>();
        layer.add(root);

        result.add(Collections.singletonList(root.val));

        while (!layer.isEmpty()) {
            Queue<Node> nextLayer = new LinkedList<>();

            while (!layer.isEmpty()) {
                Node poll = layer.poll();
                nextLayer.addAll(poll.children);
            }

            if (!nextLayer.isEmpty()) {
                result.add(nextLayer.stream().map(n -> n.val).collect(Collectors.toList()));
            }

            layer = nextLayer;
        }
        return result;
    }
}
