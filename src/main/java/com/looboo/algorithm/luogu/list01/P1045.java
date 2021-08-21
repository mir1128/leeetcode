package com.looboo.algorithm.luogu.list01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = fastPower(n);

        if (s.length() < 500) {
            s = padLeftZeros(s, 500);
        }

        s = subtract(s, "1");

        System.out.println((int) (n * Math.log10(2) + 1));
        for (int i = 0; i < 10; i++) {
            System.out.println(s.substring(i * 50, (i + 1) * 50));
        }
    }

    public static String fastPower(int n) {
        String base = "2";
        String ret = "1";

        while (n != 0) {
            if (n % 2 == 1) {
                ret = mul(ret, base);
                if (ret.length() > 500) {
                    ret = ret.substring(ret.length() - 500);
                }
            }
            n /= 2;
            base = mul(base, base);
            if (base.length() > 500) {
                base = base.substring(base.length() - 500);
            }
        }
        return ret;
    }


    private static String[] solve(int n) {
        String coef = "2";

        List<String> twoExp = new ArrayList<>();
        twoExp.add(coef);
        int c = 2;
        while (c < n) {
            coef = mul(coef, coef);
            twoExp.add(coef);
            c *= 2;
        }

        String result = "1";
        String s = Integer.toBinaryString(n);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                result = mul(result, twoExp.get(s.length() - 1 - i));
            }
        }

        result = subtract(result, "1");

        String[] ret = new String[11];
        ret[0] = String.valueOf(result.length());

        if (result.length() >= 500) {
            result = result.substring(result.length() - 500);
        } else {
            result = padLeftZeros(result, 500);
        }

        for (int i = 0; i < 10; i++) {
            ret[i + 1] = result.substring(i * 50, (i + 1) * 50);
        }

        return ret;
    }

    public static String padLeftZeros(String str, int n) {
        return String.format("%1$" + n + "s", str).replace(' ', '0');
    }

    private static String mul(String first, int second) {
        int c = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = first.length() - 1; i >= 0; i--) {
            int temp = (first.charAt(i) - '0') * second + c;
            c = temp / 10;
            stringBuilder.insert(0, temp % 10);
        }
        if (c != 0) {
            stringBuilder.insert(0, c);
        }
        return stringBuilder.toString();
    }

    private static String mul(String first, String second) {

        String sum = "0";
        int c = 0;
        for (int i = second.length() - 1; i >= 0; i--) {
            String mul = mul(first, (second.charAt(i) - '0'));

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(mul);
            for (int j = 0; j < c; j++) {
                stringBuilder.append("0");
            }
            sum = add(sum, stringBuilder.toString());
            c++;
        }
        return sum;
    }


    public static String add(String n1, String n2) {

        int c = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= Math.max(n1.length(), n2.length()); i++) {
            int a1 = i <= n1.length() ? n1.charAt(n1.length() - i) - '0' : 0;
            int a2 = i <= n2.length() ? n2.charAt(n2.length() - i) - '0' : 0;

            int res = a1 + a2 + c;
            if (res >= 10) {
                res -= 10;
                c = 1;
            } else {
                c = 0;
            }
            stringBuilder.insert(0, res);
        }
        if (c == 1) stringBuilder.insert(0, 1);

        int i = 0;
        while (i < stringBuilder.length() && stringBuilder.charAt(i) == '0') {
            ++i;
        }

        return i == stringBuilder.length() ? "0" : stringBuilder.substring(i);
    }

    private static String subtract(String n1, String n2) {
        StringBuilder stringBuilder = new StringBuilder();

        int c = 0;
        for (int i = n1.length() - 1; i >= 0; i--) {
            int i1 = n1.charAt(i) - '0';
            int index = n2.length() - (n1.length() - i);
            int i2 = index >= 0 ? n2.charAt(index) - '0' : 0;

            int m = i1 - c - i2;
            if (m < 0) {
                c = 1;
                stringBuilder.insert(0, -m);
            } else {
                stringBuilder.insert(0, m);
                c = 0;
            }
        }
        return stringBuilder.toString();
    }
}
