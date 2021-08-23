package com.looboo.algorithm.luogu.list02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        Score[] scores = new Score[n];
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            scores[i] = new Score(Integer.parseInt(tokenizer.nextToken()),
                    Integer.parseInt(tokenizer.nextToken()),
                    Integer.parseInt(tokenizer.nextToken()), i + 1);
        }

        Arrays.sort(scores);

        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i].getSerialNo() + " " + scores[i].total());
        }
    }

    private static class Score implements Comparable<Score> {
        public int yw;
        public int sx;
        public int yy;
        public int serialNo;

        public Score(int yw, int sx, int yy, int serialNo) {
            this.yw = yw;
            this.sx = sx;
            this.yy = yy;
            this.serialNo = serialNo;
        }

        public int total() {
            return yw + sx + yy;
        }

        public int getYw() {
            return yw;
        }

        public int getSerialNo() {
            return serialNo;
        }

        @Override
        public int compareTo(Score score) {
            return Comparator.comparing(Score::total, Comparator.reverseOrder())
                    .thenComparing(Score::getYw, Comparator.reverseOrder())
                    .thenComparing(Score::getSerialNo)
                    .compare(this, score);
        }
    }
}
