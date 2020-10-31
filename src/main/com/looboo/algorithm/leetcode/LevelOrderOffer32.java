package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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
}
