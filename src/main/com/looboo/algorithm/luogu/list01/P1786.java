package com.looboo.algorithm.luogu.list01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P1786 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> result = solve(scanner);

        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getPosition)
                .thenComparing((e1, e2) -> Integer.compare(e2.getLevel(), e1.getLevel()))
                .thenComparing(Employee::getLevel);

        Collections.sort(result, comparator);

        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%s %s %s%n",
                    result.get(i).getName(),
                    result.get(i).getPosition(),
                    result.get(i).getLevel());
        }
    }

    private static List<Employee> solve(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Employee> result = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        Employee bangzhu = null;
        List<Employee> fuBangZhu = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Employee employee = Employee.of(scanner.nextLine(), i);
            if (employee.position.equals(Position.BangZhu)) {
                bangzhu = employee;
            } else if (employee.position.equals(Position.FuBangZhu)) {
                fuBangZhu.add(employee);
            } else {
                employees.add(employee);
            }
        }

        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getContribute)
                .reversed()
                .thenComparing(Employee::getOrder);

        employees.sort(comparator);

        result.add(bangzhu);
        result.addAll(fuBangZhu);

        Queue<String> queue = new LinkedList<>();
        IntStream.range(0, 2).forEach(i -> queue.add("HuFa"));
        IntStream.range(0, 4).forEach(i -> queue.add("ZhangLao"));
        IntStream.range(0, 7).forEach(i -> queue.add("TangZhu"));
        IntStream.range(0, 25).forEach(i -> queue.add("JingYing"));

        for (Employee employee : employees) {
            if (!queue.isEmpty()) {
                employee.position = Position.valueOf(queue.poll());
            } else {
                employee.position = Position.valueOf("BangZhong");
            }
        }

        result.addAll(employees);

        return result;
    }

    private static class Employee {
        public String name;
        public Position position;
        public int contribute;
        public int level;
        public int order;

        public String getName() {
            return name;
        }

        public Position getPosition() {
            return position;
        }

        public int getContribute() {
            return contribute;
        }

        public int getLevel() {
            return level;
        }

        public int getOrder() {
            return order;
        }

        public static Employee of(String input, int order) {
            String[] s = input.split(" ");
            return new Employee(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]), order);
        }

        public Employee(String name, String position, int contribute, int level, int order) {
            this.name = name;
            this.position = Position.valueOf(position);
            this.contribute = contribute;
            this.level = level;
            this.order = order;
        }
    }

    public enum Position implements Comparable<Position> {
        BangZhu("BangZhu"),
        FuBangZhu("FuBangZhu"),
        HuFa("HuFa"),
        ZhangLao("ZhangLao"),
        TangZhu("TangZhu"),
        JingYing("JingYing"),
        BangZhong("BangZhong");

        private String name;

        Position(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
