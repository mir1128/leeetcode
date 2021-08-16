package com.looboo.algorithm.luogu.list01;

import java.io.InputStream;
import java.util.Scanner;

public class P1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = solve(scanner);
        System.out.println(result);
    }

    public static String solve(Scanner scanner) {
        int users = scanner.nextInt();
        int cmds = scanner.nextInt();

        int[] direct = new int[users];
        String[] profession = new String[users];

        for (int i = 0; i < users; i++) {
            direct[i] = scanner.nextInt();
            profession[i] = scanner.next();
        }

        int[][] command  = new int[cmds][2];

        for (int i = 0; i < cmds; i++) {
            command[i][0] = scanner.nextInt();
            command[i][1] = scanner.nextInt();
        }

        int current = 0;
        for (int i = 0; i < command.length; i++) {
            if (command[i][0] == 0) {
                if (direct[current] == 0) {
                    current = (current + users - command[i][1]) % users;
                } else {
                    current = (current + command[i][1]) % users;
                }
            } else {
                if (direct[current] == 0) {
                    current = (current + command[i][1]) % users;
                } else {
                    current = (current + users - command[i][1]) % users;
                }
            }
        }
        return profession[current];
    }
}
