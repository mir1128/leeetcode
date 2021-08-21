package com.looboo.algorithm.package9.pack02;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompletePackTest {
    @Test
    public void test01() {
        int[][] items = Utils.intArray2d("[[1,2],[2,4],[3,4],[4,5]]");
        assertEquals(10, new CompletePack().completePack(5, items));
    }
}