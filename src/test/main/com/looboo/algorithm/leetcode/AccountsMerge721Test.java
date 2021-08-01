package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AccountsMerge721Test {
    @Test
    public void test01() {

        List<List<String>> accounts = Arrays.asList(
                Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
                Arrays.asList("John", "johnnybravo@mail.com"),
                Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                Arrays.asList("Mary", "mary@mail.com"));

        List<List<String>> lists = new AccountsMerge721().accountsMerge(accounts);
    }

    @Test
    public void test02() {
        List<List<String>> accounts = Arrays.asList(
                Arrays.asList("David","David0@m.co","David1@m.co"),
                Arrays.asList("David","David3@m.co","David4@m.co"),
                Arrays.asList("David","David4@m.co","David5@m.co"),
                Arrays.asList("David","David2@m.co","David3@m.co"),
                Arrays.asList("David","David1@m.co","David2@m.co"));

        List<List<String>> lists = new AccountsMerge721().accountsMerge(accounts);

    }
}