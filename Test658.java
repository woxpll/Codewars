package com.company;

import java.util.TreeSet;

public class Test658 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");

        System.out.println(ts);

        System.out.println(ts.subSet("C","F"));
    }

}
