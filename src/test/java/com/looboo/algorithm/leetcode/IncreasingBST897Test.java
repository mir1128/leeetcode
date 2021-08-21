package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingBST897Test {
    @Test
    public void test01() {
        TreeNode build = TreeNode.build1("[5,3,6,2,4,null,8,1,null,null,null,7,9]");
        new IncreasingBST897().increasingBST(build);
    }
}