package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsEvenOddTreeTest {

    @Test
    public void test01() {
        TreeNode build = TreeNode.build("[11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]");
        assertTrue(new IsEvenOddTree().isEvenOddTree(build));
    }

    @Test
    public void test02() {
        TreeNode build = TreeNode.build("[5,9,1,3,5,7]");
        assertFalse(new IsEvenOddTree().isEvenOddTree(build));
    }

    @Test
    public void test03() {
        TreeNode build = TreeNode.build("5,4,2,3,3,7");
        assertFalse(new IsEvenOddTree().isEvenOddTree(build));
    }
}