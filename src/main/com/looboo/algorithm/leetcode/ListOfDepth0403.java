package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;

public class ListOfDepth0403 {
    public ListNode[] listOfDepth(TreeNode tree) {

        List<ListNode> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);

        while (!queue.isEmpty()) {
            Queue<TreeNode> layer = new LinkedList<>();
            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;

            while (!queue.isEmpty()) {
                TreeNode head = queue.poll();
                curr.next = new ListNode(head.val);
                curr = curr.next;

                if (head.left != null) {
                    layer.add(head.left);
                }
                if (head.right != null) {
                    layer.add(head.right);
                }
            }
            result.add(dummy.next);
            queue = layer;
        }
        return result.toArray(new ListNode[result.size()]);
    }
}
