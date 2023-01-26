package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeWars2 {

    public static void main(String[] args) {

        Kata kata = new Kata();
        kata.invert(new int[]{1, -2, 3, 4, -5});

    }
}


class Kata {
    public static int[] invert(int[] array) {

        for(int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        return array;
    }
}