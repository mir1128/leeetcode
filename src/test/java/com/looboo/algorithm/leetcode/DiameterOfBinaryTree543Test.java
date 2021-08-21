package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiameterOfBinaryTree543Test {
    @Test
    public void test01() {
        TreeNode treeNode = TreeNode.build1("[1,2,3,4,5]");
        assertEquals(3, new DiameterOfBinaryTree543().diameterOfBinaryTree(treeNode));
    }

    @Test
    public void test02() {
        TreeNode treeNode = TreeNode.build1("[1]");
        assertEquals(0, new DiameterOfBinaryTree543().diameterOfBinaryTree(treeNode));
    }


    @Test
    public void test03() {
        TreeNode treeNode = TreeNode.build1("[1,2,3,4,5,6,7,8,9,10,11,12,13]");
        assertEquals(6, new DiameterOfBinaryTree543().diameterOfBinaryTree(treeNode));
    }

    @Test
    public void test04() {
        TreeNode treeNode = TreeNode.build1("[1,2]");
        assertEquals(1, new DiameterOfBinaryTree543().diameterOfBinaryTree(treeNode));
    }
}