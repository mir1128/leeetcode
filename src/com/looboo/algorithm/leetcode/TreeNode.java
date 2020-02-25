package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode build(String s) {
        String m = s.substring(1, s.length() - 1);
        String[] split = m.split(",");

        List<TreeNode> nodeList = new ArrayList<>(split.length);
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("null")) {
                nodeList.add(null);
            } else {
                nodeList.add(new TreeNode(Integer.valueOf(split[i])));
            }
            if (i > 0) {
                int k = (i-1) / 2;
                if ( (i-1) % 2 == 0) {
                    nodeList.get(k).left = nodeList.get(i);
                } else {
                    nodeList.get(k).right = nodeList.get(i);
                }
            }
        }
        return nodeList.get(0);
    }
}
