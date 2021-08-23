package com.looboo.algorithm.luogu.list02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassMate[] mates = solve(scanner);

        for (int i = 0; i < mates.length; i++) {
            System.out.println(mates[i].name);
        }
    }

    public static ClassMate[] solve(Scanner scanner) {
        int n = scanner.nextInt();

        ClassMate[] mates = new ClassMate[n];
        for (int i = 0; i < n; i++) {
            mates[i] = new ClassMate(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), i);
        }

        Comparator<ClassMate> comparator = Comparator
                .comparing(ClassMate::getYear)
                .thenComparing(ClassMate::getMonth)
                .thenComparing(ClassMate::getDay)
                .thenComparing(ClassMate::getOrder, Comparator.reverseOrder());

        Arrays.sort(mates, comparator);

        return mates;
    }

    public static class ClassMate {
        private String name;
        public int year;
        public int month;
        public int day;
        public int order;

        public ClassMate(String name, int year, int month, int day, int order) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
            this.order = order;
        }

        public int getOrder() {
            return order;
        }

        public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        @Override
        public String toString() {
            return String.format("%s: %s-%s-%s", name, year, month, day);
        }
    }
}
