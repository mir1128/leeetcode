package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontMiddleBackQueueTest {
    @Test
    public void test01() {
        FrontMiddleBackQueue q = new FrontMiddleBackQueue();
        q.pushFront(1);   // [1]
        q.pushBack(2);    // [1, 2]
        q.pushMiddle(3);  // [1, 3, 2]
        q.pushMiddle(4);  // [1, 4, 3, 2]
        q.popFront();     // 返回 1 -> [4, 3, 2]
        q.popMiddle();    // 返回 3 -> [4, 2]
        q.popMiddle();    // 返回 4 -> [2]
        q.popBack();      // 返回 2 -> []
        q.popFront();     // 返回 -1 -> [] （队列为空）
    }
}