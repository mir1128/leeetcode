package com.looboo.algorithm.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestOffer54 {

    private PriorityQueue<Integer> queue;

    public int kthLargest(TreeNode root, int k) {
        queue = new PriorityQueue<>(Comparator.comparingInt(i -> -i));

        traverse(root);

        int i = 0;
        while (i < k - 1) {
            queue.poll();
            i++;
        }

        return queue.peek();
    }

    private void traverse(TreeNode root) {
        if (root.left != null) {
            traverse(root.left);
        }

        queue.add(root.val);

        if (root.right != null) {
            traverse(root.right);
        }
    }
}
