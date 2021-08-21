package com.looboo.algorithm.luogu.list01;

import java.util.Scanner;

public class P1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = solve(scanner);
        System.out.println(result);
    }

    public static String solve(Scanner scanner) {
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int p3 = scanner.nextInt();

        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder();

        int pos = 0;
        int prev = 0;
        while (pos != -1) {
            pos = input.indexOf('-', pos);

            if (pos == -1) break;
            if (pos == 0) {
                stringBuilder.append('-');
                prev = pos + 1;
                pos = pos + 1;
                continue;
            } else if (pos == input.length() - 1) {
                stringBuilder.append(input, prev, pos);
                stringBuilder.append('-');
                prev = pos + 1;
                pos = pos + 1;
                break;
            }

            stringBuilder.append(input, prev, pos);

            String filledString = fill(p1, p2, p3, input.charAt(pos - 1), input.charAt(pos + 1));

            stringBuilder.append(filledString);

            prev = pos + 1;
            pos = pos + 1;
        }
        stringBuilder.append(input.substring(prev));

        return stringBuilder.toString();
    }

    private static String fill(int p1, int p2, int p3, char start, char end) {

        StringBuilder stringBuilder = new StringBuilder();
        if (isNumber(start) && isNumber(end) && start < end) {
            if (start + 1 == end) return "";
            for (int i = start + 1; i < end; i++) {
                for (int j = 0; j < p2; j++) {
                    if (p1 == 3) {
                        stringBuilder.append('*');
                    } else {
                        stringBuilder.append((char) i);
                    }
                }
            }
            if (p3 == 2) stringBuilder.reverse();
            return stringBuilder.toString();
        } else if (isAlpha(start) && isAlpha(end) && start < end) {
            if (start + 1 == end) return "";

            for (int i = start + 1; i < end; i++) {
                for (int j = 0; j < p2; j++) {
                    if (p1 == 3) {
                        stringBuilder.append('*');
                    } else {
                        stringBuilder.append((char) i);
                    }
                }
            }

            if (p3 == 2) stringBuilder.reverse();
            if (p1 == 1) return stringBuilder.toString().toLowerCase();
            if (p1 == 2) return stringBuilder.toString().toUpperCase();
            return stringBuilder.toString();
        }

        return "-";
    }

    public static boolean isNumber(char c) {
        return '0' <= c && c <= '9';
    }

    public static boolean isAlpha(char a) {
        return ('a' <= a && a <= 'z') || ('A' <= a && a <= 'Z');
    }
}
