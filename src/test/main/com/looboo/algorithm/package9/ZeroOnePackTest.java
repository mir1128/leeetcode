package com.looboo.algorithm.package9;

import com.looboo.algorithm.utils.Utils;
import com.looboo.algorithm.package9.pack01.ZeroOnePack;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroOnePackTest {

    @Test
    public void test01() {
        int[][] items = Utils.intArray2d("[[1,2],[2,4],[3,4],[4,5]]");
        assertEquals(8, new ZeroOnePack().zeroOnePack(5, items));
    }
}
