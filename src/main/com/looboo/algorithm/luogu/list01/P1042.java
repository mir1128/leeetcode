package com.looboo.algorithm.luogu.list01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1042 {
    public static void main(String[] args) {

//        InputStream resourceAsStream = P1042.class.getClassLoader().getResourceAsStream("p1042/P1042_2.in");

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next());
        }

        List<String> result = solve(stringBuilder.toString());
        result.forEach(System.out::println);
    }

    public static List<String> solve(String input) {
        int w11 = 0, l11 = 0;
        int w21 = 0, l21 = 0;

        List<String> list11 = new ArrayList<>();
        List<String> list21 = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'W') {
                w11++;
                w21++;
            } else if (input.charAt(i) == 'L') {
                l11++;
                l21++;
            } else if (input.charAt(i) == 'E') {
                break;
            } else {
                continue;
            }

            if ((w11 >= 11 || l11 >= 11) && Math.abs(w11 - l11) >= 2) {
                list11.add(String.format("%s:%s", w11, l11));
                w11 = 0;
                l11 = 0;
            }

            if ((w21 >= 21 || l21 >= 21) && Math.abs(w21 - l21) >= 2) {
                list21.add(String.format("%s:%s", w21, l21));
                w21 = 0;
                l21 = 0;
            }
        }

        list11.add(String.format("%s:%s", w11, l11));
        list21.add(String.format("%s:%s", w21, l21));

        list11.add("");
        list11.addAll(list21);
        return list11;
    }
}
