package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsBalancedOffer55Test {
    @Test
    public void test01() {
        TreeNode build = TreeNode.build1("[1,2,2,3,null,null,3,4,null,null,4]");
        assertFalse(new IsBalancedOffer55().isBalanced(build));
    }

    @Test
    public void test02() {
        TreeNode build = TreeNode.build1("[1,2,2,3,null,null,3,4,null,null,4]");
        assertFalse(new IsBalancedOffer55().isBalanced(build));
    }
}