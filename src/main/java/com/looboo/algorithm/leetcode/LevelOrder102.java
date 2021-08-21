package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder102 {

    public static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> element = queue.poll();
            int level = element.u;
            TreeNode node = element.t;

            if (result.size() == level) {
                result.add(new ArrayList<>());
            }

            result.get(level).add(node.val);

            if (node.left != null) queue.add(new Pair(node.left, level+1));
            if (node.right != null) queue.add(new Pair(node.right, level+1));
        }
        return result;
    }
}
