package com.looboo.algorithm.luogu.list02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Score[] scores = new Score[n];
        for (int i = 0; i < n; i++) {
            scores[i] = new Score(scanner.nextInt(), scanner.nextInt());
        }

        Comparator<Score> comparator = Comparator
                .comparing(Score::getScore, Comparator.reverseOrder())
                .thenComparing(Score::getOrder);
        Arrays.sort(scores, comparator);

        int ret = (int) (m * 1.5);

        int lastScore = scores[ret - 1].score;

        int i = ret;
        for (; i < n; i++) {
            if (scores[i].score != lastScore) break;
        }

        System.out.printf("%s %s%n", scores[i-1].score, i);
        for (int j = 0; j < i; j++) {
            System.out.printf("%s %s%n", scores[j].order, scores[j].score);
        }
    }

    public static class Score {
        public int order;
        public int score;

        public Score(int order, int score) {
            this.order = order;
            this.score = score;
        }

        public int getOrder() {
            return order;
        }

        public int getScore() {
            return score;
        }
    }
}
