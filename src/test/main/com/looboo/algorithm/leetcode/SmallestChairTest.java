package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestChairTest {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[33889,98676],[80071,89737],[44118,52565],[52992,84310],[78492,88209],[21695,67063],[84622,95452],[98048,98856],[98411,99433],[55333,56548],[65375,88566],[55011,62821],[48548,48656],[87396,94825],[55273,81868],[75629,91467]]");

        assertEquals(2, new SmallestChair().smallestChair(ints, 6));
    }

    @Test
    public void name() {

        int[][] ints = Utils.intArray2d("[[3,10],[1,5],[2,6]]");

        assertEquals(2, new SmallestChair().smallestChair(ints, 0));

    }

    @Test
    public void test03() {
        int[][] ints = Utils.intArray2d("[[98198,99979],[94438,98042],[6104,64150],[15632,17378],[6923,88529],[68469,98315],[37973,86066],[90969,99746],[92396,96991],[53994,66509],[92972,97874],[70262,84374],[50387,64907],[99240,99985],[25642,56565],[7253,9683],[43669,68559],[60520,85461],[96567,97544],[64789,83994],[73723,84301],[55796,58566],[67943,78915],[92673,94868],[53570,58135],[69549,78461],[17694,75744],[9265,77868],[57880,89655],[23327,80521],[91232,91639],[91623,92961],[49501,88454],[88932,91622],[54965,59650],[46587,60025],[45140,98782],[47029,90516],[28112,29624],[73021,83152],[5377,19703],[70610,72191],[40633,66034],[87913,98864],[35913,50422],[39121,93376],[21100,79841],[8190,68139],[5140,54276],[22993,62342],[3491,8572],[70407,81025],[81198,96920],[29041,31796],[77060,81160],[94588,97686]]");

        assertEquals(0, new SmallestChair().smallestChair(ints, 50));

    }
}