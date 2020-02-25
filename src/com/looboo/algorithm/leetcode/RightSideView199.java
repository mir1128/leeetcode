package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView199 {
    public static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> element = queue.poll();
            TreeNode node = element.t;
            Integer level = element.u;

            if (result.size() == level) {
                result.add(node.val);
            } else {
                result.set(level, node.val);
            }
            if (node.left != null) queue.add(new Pair(node.left, level+1));
            if (node.right != null) queue.add(new Pair(node.right, level+1));
        }
        return result;
    }

}
