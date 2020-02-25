package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder103 {


    public static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> element = queue.poll();
            int level = element.u;
            TreeNode node = element.t;

            if (result.size() == level) {
                result.add(new LinkedList<>());
            }

            if (level % 2 == 0) {
                result.get(level).add(node.val);
            } else {
                result.get(level).add(0, node.val);
            }


            if (node.left != null) queue.add(new Pair(node.left, level + 1));
            if (node.right != null) queue.add(new Pair(node.right, level + 1));
        }
        return result;
    }
}
