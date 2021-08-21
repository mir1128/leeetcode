package com.looboo.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class IsEvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {

        int i = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Queue<TreeNode> nextLayer = new LinkedList<>();

            int last = i % 2 == 0 ? -1 : Integer.MAX_VALUE;
            while (!queue.isEmpty()) {
                TreeNode poll = queue.poll();
                if ((i % 2 == 0 && last >= poll.val) || (i % 2 == 1 && last <= poll.val)) {
                    return false;
                }

                if ((i % 2 == 0 && poll.val % 2 == 0) || (i % 2 == 1 && poll.val % 2 == 1)) {
                    return false;
                }

                last = poll.val;

                if (poll.left != null) nextLayer.add(poll.left);
                if (poll.right != null) nextLayer.add(poll.right);
            }
            queue = nextLayer;
            ++i;
        }

        return true;
    }
}
