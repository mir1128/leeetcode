package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderOffer32 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            Deque<TreeNode> nextLayer = new LinkedList<>();
            List<Integer> currentLayer = new ArrayList<>();
            while (!deque.isEmpty()) {
                TreeNode treeNode = deque.pollFirst();
                currentLayer.add(treeNode.val);
                if (treeNode.left != null) nextLayer.addLast(treeNode.left);
                if (treeNode.right != null) nextLayer.addLast(treeNode.right);
            }
            deque = nextLayer;
            result.add(currentLayer);
        }
        return result;
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);

        boolean order = true;
        while (!deque.isEmpty()) {
            Deque<TreeNode> nextLayer = new LinkedList<>();
            List<Integer> currentLayer = new ArrayList<>();
            while (!deque.isEmpty()) {
                TreeNode treeNode = deque.pollFirst();
                currentLayer.add(treeNode.val);
                if (treeNode.left != null) nextLayer.addLast(treeNode.left);
                if (treeNode.right != null) nextLayer.addLast(treeNode.right);
            }
            deque = nextLayer;
            if (order) {
                order = false;
            } else {
                Collections.reverse(currentLayer);
                order = true;
            }
            result.add(currentLayer);
        }
        return result;
    }

    public int[] levelOrder1(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();
            result.add(head.val);
            if (head.left != null) queue.add(head.left);
            if (head.right != null) queue.add(head.right);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
