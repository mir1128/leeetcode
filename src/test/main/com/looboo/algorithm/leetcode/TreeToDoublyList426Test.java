package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeToDoublyList426Test {
    @Test
    public void name() {
        TreeToDoublyList426.Node node = TreeToDoublyList426.build1("[28,-98,67,null,-89,62,null,-97,-25,null,64,null,null,-72,-9,null,null,-88,-41,null,-7,null,-78,-53,null,null,2,-85,-77,-69,-42,-1]");

        TreeToDoublyList426.Node node1 = new TreeToDoublyList426().treeToDoublyList(node);

        TreeToDoublyList426.Node head = node1;
        while (node1.right != head) {
            System.out.println(node1.val);
            node1 = node1.right;
        }
     }
}