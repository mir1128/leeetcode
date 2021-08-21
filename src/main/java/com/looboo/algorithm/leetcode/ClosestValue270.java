package com.looboo.algorithm.leetcode;

import java.util.TreeSet;

public class ClosestValue270 {
    public int closestValue(TreeNode root, double target) {

        double e = Double.MAX_VALUE;
        int res = root.val;
        TreeNode curr = root;
        while (curr != null) {

            if (Math.abs(target - curr.val) < 0.000000001) {
                return curr.val;
            }

            if (target > curr.val) {
                if (target - curr.val < e) {
                    e = target - curr.val;
                    res = curr.val;
                }
                curr = curr.right;
            } else {
                if (curr.val - target < e) {
                    e = curr.val - target;
                    res = curr.val;
                }
                curr = curr.left;
            }
        }

        return res;
    }
}
