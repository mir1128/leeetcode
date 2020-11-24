package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {
    /**
     * initialize your data structure here.
     */

    private Stack<Integer> stack;
    private Map<Integer, Integer> map;
    private PriorityQueue<Integer> priorityQueue;
    private Integer min;

    public MinStack() {
        stack = new Stack<>();
        map = new HashMap<>();
        priorityQueue = new PriorityQueue<>();
    }

    public void push(int x) {

        if (!map.containsKey(x)) {
            priorityQueue.add(x);
            map.put(x, 1);
        } else {
            map.put(x, map.get(x) + 1);
        }

        stack.push(x);

        if (min == null || x < min) {
            min = x;
        }

    }

    public void pop() {
        if (stack.isEmpty()) return;
        Integer pop = stack.pop();

        map.put(pop, map.get(pop) - 1);

        while (!map.isEmpty() && map.containsKey(pop) && map.get(pop) == 0) {
            map.remove(pop);
            if (!priorityQueue.isEmpty()) {
                pop = priorityQueue.poll();
                min = pop;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
