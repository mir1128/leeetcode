package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorOffer68Test {

    @Test
    public void test01() {
        TreeNode build = TreeNode.build("[3,5,1,6,2,0,8,null,null,7,4]");
        assertEquals(new TreeNode(3).val, new LowestCommonAncestorOffer68().lowestCommonAncestor(build, new TreeNode(5), new TreeNode(1)).val);
    }

    @Test
    public void test02() {
        TreeNode build = TreeNode.build("[3,5,1,6,2,0,8,null,null,7,4]");
        assertEquals(new TreeNode(5).val, new LowestCommonAncestorOffer68().lowestCommonAncestor(build, new TreeNode(5), new TreeNode(4)).val);
    }
}