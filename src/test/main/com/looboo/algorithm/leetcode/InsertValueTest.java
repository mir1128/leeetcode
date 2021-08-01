package com.looboo.algorithm.leetcode;

import org.junit.Test;

public class InsertValueTest {
    @Test
    public void test01() {
        InsertValue.Node n1 = new InsertValue.Node(3);
        InsertValue.Node n2 = new InsertValue.Node(4);
        InsertValue.Node n3 = new InsertValue.Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

        InsertValue.Node n = new InsertValue().insert(n1, 2);

        print(n1);
    }

    private void print(InsertValue.Node n1) {
        InsertValue.Node curr = n1;
        do {
            System.out.println(curr.val);
            curr = curr.next;
        } while (curr != n1);
    }

    @Test
    public void test02() {
        InsertValue.Node n1 = new InsertValue.Node(1);
        n1.next = n1;

        InsertValue.Node n = new InsertValue().insert(n1, 2);
        print(n1);
    }

    @Test
    public void test03() {
        InsertValue.Node n1 = new InsertValue.Node(3);
        InsertValue.Node n2 = new InsertValue.Node(5);
        InsertValue.Node n3 = new InsertValue.Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

        InsertValue.Node n = new InsertValue().insert(n1, 0);

        print(n1);
    }
}