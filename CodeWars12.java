package com.company;

import java.util.Arrays;

public class CodeWars12 {

    public static void main(String[] args) {

        String [] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String [] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

    }
}

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {

        if (a1 == null || a1.length == 0 || a2 == null || a2.length == 0)
            return -1;

        int maxVal = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                int diff = Math.abs(a1[i].length() - a2[j].length());
                if (diff > maxVal)
                    maxVal = diff;
            }
        }

        return maxVal;
    }
}