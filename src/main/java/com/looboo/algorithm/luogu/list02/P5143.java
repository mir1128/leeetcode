package com.looboo.algorithm.luogu.list02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P5143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Coordinator[] coordinators = new Coordinator[n];
        for (int i = 0; i < n; i++) {
            coordinators[i] = new Coordinator(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }

        Arrays.sort(coordinators, Comparator.comparing(Coordinator::getZ));

        double total = 0.0;
        for (int i = 1; i < n; i++) {
            int temp = (coordinators[i].x - coordinators[i - 1].x) * (coordinators[i].x - coordinators[i - 1].x)
                    + (coordinators[i].y - coordinators[i - 1].y) * (coordinators[i].y - coordinators[i - 1].y)
                    + (coordinators[i].z - coordinators[i - 1].z) * (coordinators[i].z - coordinators[i - 1].z);

            total += Math.sqrt(temp);
        }

        System.out.printf("%.3f%n", total);
    }

    public static class Coordinator {
        public int x;
        public int y;
        public int z;

        public Coordinator(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int getZ() {
            return z;
        }
    }
}
