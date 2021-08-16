package com.looboo.algorithm.luogu.list01;

import com.looboo.algorithm.leetcode.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = solve(scanner);
        System.out.println(result);
    }

    private static int solve(Scanner scanner) {
        char[][] board = new char[10][10];

        int[] john = new int[3];
        int[] cow = new int[3];
        for (int i = 0; i < 10; i++) {
            String next = scanner.next();
            for (int j = 0; j < 10; j++) {
                board[i][j] = next.charAt(j);
                if (board[i][j] == 'F') {
                    john = new int[]{i, j, 0};
                }
                if (board[i][j] == 'C') {
                    cow = new int[]{i, j, 0};
                }
            }
        }

//        Utils.print(board);

        String boardStr = boardToString(board);
        Map<String, Integer> boardMap = new HashMap<>();

        int n = 0;
        do {
            boardMap.put(boardStr, john[2] * 4 + cow[2]);

            int[] johnNew = move(john, board);
            int[] cowNew = move(cow, board);

            board[john[0]][john[1]] = '.';
            board[cow[0]][cow[1]] = '.';
            board[johnNew[0]][johnNew[1]] = 'F';
            board[cowNew[0]][cowNew[1]] = 'C';

            john = johnNew;
            cow = cowNew;
            n++;

//            System.out.printf("--------%s---------%n", n);
//            Utils.print(board);

            if (john[0] == cow[0] && john[1] == cow[1]) {
                return n;
            }

            boardStr = boardToString(board);

        } while (!(boardMap.containsKey(boardStr) && boardMap.get(boardStr) == john[2] * 4 + cow[2]));

        return 0;
    }

    private static String boardToString(char[][] board) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(board[i / 10][i % 10]);
        }
        return stringBuilder.toString();
    }

    private static int[] move(int[] s, char[][] board) {
        if (s[2] == 0) {
            if (s[0] > 0 && board[s[0] - 1][s[1]] != '*') {
                return new int[]{s[0] - 1, s[1], 0};
            } else {
                return new int[]{s[0], s[1], 1};
            }
        } else if (s[2] == 1) {
            if (s[1] < 9 && board[s[0]][s[1] + 1] != '*') {
                return new int[]{s[0], s[1] + 1, 1};
            } else {
                return new int[]{s[0], s[1], 2};
            }
        } else if (s[2] == 2) {
            if (s[0] < 9 && board[s[0] + 1][s[1]] != '*') {
                return new int[]{s[0] + 1, s[1], 2};
            } else {
                return new int[]{s[0], s[1], 3};
            }
        } else {
            if (s[1] > 0 && board[s[0]][s[1] - 1] != '*') {
                return new int[]{s[0], s[1] - 1, 3};
            } else {
                return new int[]{s[0], s[1], 0};
            }
        }
    }
}
