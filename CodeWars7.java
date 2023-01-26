package com.company;

import java.util.Arrays;

public class CodeWars7 {
    public static void main(String[] args) {

    }
}

class TestWord{

    public static String oddOrEven (int[] array) {

        int i = Arrays.stream(array).sum();
        if (i % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }
}
