package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom107 {

    public static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> element = queue.poll();
            int level = element.u;
            TreeNode node = element.t;

            if (result.size() == level) {
                result.add(0, new ArrayList<>());
            }

            result.get(0).add(node.val);

            if (node.left != null) queue.add(new Pair(node.left, level+1));
            if (node.right != null) queue.add(new Pair(node.right, level+1));
        }
        return result;
    }

    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
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

            result.get(0).add(node.val);

            if (node.left != null) queue.add(new Pair(node.left, level+1));
            if (node.right != null) queue.add(new Pair(node.right, level+1));
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode build = TreeNode.build("[3,9,20,null,null,15,7]");
        List<List<Integer>> lists = new LevelOrderBottom107().levelOrderBottom2(build);
        System.out.println(lists);
    }
}
