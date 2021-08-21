package com.looboo.algorithm.template;

public class HighPrecision {

    public static String add(String n1, String n2) {
        int c = 0;
        int len1 = n1.length();
        int len2 = n2.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(len1, len2); i++) {
            int a = len1 - 1 - i >= 0 ? n1.charAt(len1 - 1 - i) - '0' : 0;
            int b = len2 - 1 - i >= 0 ? n2.charAt(len2 - 1 - i) - '0' : 0;

            int temp = a + b + c;
            c = temp / 10;
            sb.insert(0, temp % 10);
        }

        if (c == 1) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }

    public static String mul(String first, String second) {
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

    public static String sub(String n1, String n2) {
        int len1 = n1.length();
        int len2 = n2.length();

        String first;
        String second;
        boolean negative = false;
        if (len1 > len2) {
            first = n1;
            second = n2;
        } else if (len1 < len2) {
            first = n2;
            second = n1;
            negative = true;
        } else {
            int cmp = n1.compareTo(n2);
            if (cmp < 0) {
                first = n2;
                second = n1;
                negative = true;
            } else if (cmp > 0) {
                first = n1;
                second = n2;
            } else {
                return "0";
            }
        }

        len1 = first.length();
        len2 = second.length();

        int c = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len1; i++) {
            int a = len1 - 1 - i >= 0 ? first.charAt(len1 - 1 - i) - '0' : 0;
            int b = len2 - 1 - i >= 0 ? second.charAt(len2 - 1 - i) - '0' : 0;

            int temp = a - c - b;
            if (temp < 0) {
                sb.insert(0, 10 + temp);
                c = 1;
            } else {
                sb.insert(0, temp);
                c = 0;
            }
        }

        String result = trim(sb.toString());

        if (negative) {
            return String.format("-%s", result);
        }
        return result;
    }

    //指数是int
    public static String power(String n1, int n2) {

        String result = "1";
        String base = n1;

        while (n2 != 0) {
            if ((n2 & 1) == 1) result = mul(result, base);
            base = mul(base, base);
            n2  = n2 >> 1;
        }

        return result;
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

    public static String trim(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != '0') return s.substring(i);
            ++i;
        }
        return "0";
    }
}
