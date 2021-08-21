package com.looboo.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class FrontMiddleBackQueue {

    private Deque<Integer> front;
    private Deque<Integer> tail;

    public FrontMiddleBackQueue() {
        front = new LinkedList<>();
        tail = new LinkedList<>();
    }

    public void pushFront(int val) {
        front.addFirst(val);
        while (front.size() - tail.size() > 1) {
            tail.addFirst(front.pollLast());
        }
    }

    public void pushMiddle(int val) {
        if (front.size() == tail.size()) {
            front.addLast(val);
        } else {
            tail.addFirst(front.pollLast());
            front.addLast(val);
        }
    }

    public void pushBack(int val) {
        tail.addLast(val);
        while (tail.size() > front.size()) {
            front.addLast(tail.pollFirst());
        }
    }

    public int popFront() {
        if (front.isEmpty()) {
            return -1;
        }

        Integer val = front.pollFirst();
        while (tail.size() > front.size()) {
            front.addLast(tail.pollFirst());
        }
        return val;
    }

    public int popMiddle() {

        if (front.isEmpty()) {
            return -1;
        }

        Integer val = front.pollLast();
        while (tail.size() > front.size()) {
            front.addLast(tail.pollFirst());
        }
        return val;
    }

    public int popBack() {
        if (tail.isEmpty()) {
            if (front.isEmpty()) {
                return -1;
            } else {
                return front.pollLast();
            }
        } else {
            Integer val = tail.pollLast();
            while (front.size() - tail.size() > 1) {
                tail.addFirst(front.pollLast());
            }
            return val;
        }
    }
}
