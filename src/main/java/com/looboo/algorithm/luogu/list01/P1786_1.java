package com.looboo.algorithm.luogu.list01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P1786_1 {

    private static Map<String, Integer> jobMapping = new HashMap<>();

    static {
        jobMapping.put("BangZhu", 7);
        jobMapping.put("FuBangZhu", 6);
        jobMapping.put("HuFa", 5);
        jobMapping.put("ZhangLao", 4);
        jobMapping.put("TangZhu", 3);
        jobMapping.put("JingYing", 2);
        jobMapping.put("BangZhong", 1);
    };

    private static String[] nameArray = new String[]{"", "BangZhong", "JingYing", "TangZhu", "ZhangLao", "HuFa", "FuBangZhu", "BangZhu"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Member> result = solve(scanner);

        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%s %s %s%n",
                    result.get(i).getName(),
                    nameArray[result.get(i).job],
                    result.get(i).level
            );
        }
    }

    private static List<Member> solve(Scanner scanner) {
        int n = scanner.nextInt();

        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String job = scanner.next();
            int score = scanner.nextInt();
            int level = scanner.nextInt();
            members[i] = new Member(name, jobMapping.get(job), level, score, i);
        }

        Arrays.sort(members, 3, n, Comparator
                .comparing(Member::getScore)
                .reversed()
                .thenComparing(Member::getOrder));

        for (int i = 3; i < members.length; i++) {
            if (i <= 4) members[i].job = 5;
            else if (i <= 8) members[i].job = 4;
            else if (i <= 15) members[i].job = 3;
            else if (i <= 40) members[i].job = 2;
            else members[i].job = 1;
        }

        Comparator<Member> comparator = Comparator.comparing(Member::getJob, Comparator.reverseOrder())
                .thenComparing(Member::getLevel, Comparator.reverseOrder())
                .thenComparing(Member::getOrder);
        Arrays.sort(members, 3, n, comparator);

        return Arrays.asList(members);
    }

    private static class Member {
        public String name;
        public int job;
        public int level;
        public int score;
        public int order;

        public int getScore() {
            return score;
        }

        public int getOrder() {
            return order;
        }

        public String getName() {
            return name;
        }

        public int getJob() {
            return job;
        }

        public int getLevel() {
            return level;
        }

        public Member(String name, int job, int level, int score, int order) {
            this.name = name;
            this.job = job;
            this.level = level;
            this.score = score;
            this.order = order;
        }
    }
}
