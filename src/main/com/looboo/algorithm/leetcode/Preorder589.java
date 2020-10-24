package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Preorder589 {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(Node root, List<Integer> result) {

        if (root == null) return;

        result.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            traverse(root.children.get(i), result);
        }
    }
}
