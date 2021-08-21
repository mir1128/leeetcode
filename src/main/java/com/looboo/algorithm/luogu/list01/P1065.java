package com.looboo.algorithm.luogu.list01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class P1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = solve(scanner);
        System.out.println(result);
    }

    private static int solve(Scanner scanner) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] order = new int[m * n];
        for (int i = 0; i < m * n; i++) {
            order[i] = scanner.nextInt() - 1;
        }

        int[][] machine = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                machine[i][j] = scanner.nextInt() - 1;
            }
        }

        int[][] time = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                time[i][j] = scanner.nextInt();
            }
        }

        Map<Integer, LinkedList<Pair>> map = new HashMap<>();

        int[] step = new int[n];
        int[] itemLast = new int[n];
        for (int i = 0; i < m * n; i++) {
            int item = order[i];

            int machineNo = machine[item][step[item]];
            map.putIfAbsent(machineNo, new LinkedList<>());
            int newFinishedAt = addWork(map.get(machineNo), time[item][step[item]], itemLast[item]);

            ++step[item];
            itemLast[item] = Math.max(itemLast[item], newFinishedAt);
        }

        return map.values().stream().mapToInt(list -> list.getLast().end).max().getAsInt();
    }

    public static int addWork(LinkedList<Pair> list, int time, int lastFinishAt) {
        if (list.isEmpty()) {
            list.add(new Pair(lastFinishAt, lastFinishAt + time));
            return lastFinishAt + time;
        }

        if (lastFinishAt <= list.get(0).start &&  list.get(0).start - lastFinishAt >= time) {
            list.add(0, new Pair(lastFinishAt, lastFinishAt + time));
            return lastFinishAt + time;
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).start - list.get(i - 1).end >= time) {

                if (lastFinishAt <= list.get(i - 1).end) {
                    list.add(i, new Pair(list.get(i - 1).end, list.get(i - 1).end + time));

                    return list.get(i - 1).end + time;
                } else if (lastFinishAt > list.get(i - 1).end
                        && lastFinishAt <= list.get(i).start
                        && list.get(i).start - lastFinishAt >= time) {
                    list.add(i, new Pair(lastFinishAt, lastFinishAt + time));
                    return lastFinishAt + time;
                }
            }
        }

        int start = Math.max(list.getLast().end, lastFinishAt);
        list.add(new Pair(start, start + time));
        return start + time;
    }


    private static class Pair implements Comparable<Pair> {
        public int start;
        public int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.start, o.start);
        }

        @Override
        public String toString() {
            return String.format("(%s, %s)", start, end);
        }
    }
}
