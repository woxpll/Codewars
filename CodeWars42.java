package com.company;

import java.util.Arrays;
import java.util.Locale;

public class CodeWars42 {

    public static void main(String[] args) {

        String s = "ZpglnRxqenU";
        String f = s.toUpperCase();
        String [] b = s.toUpperCase().split("");

        for (int i = 0; i < b.length; i++) {
            String str = b[i].toLowerCase();
            for (int j = 0; j < i; j++) {
                b[i] = b[i].concat(str);
            }
        }

        String result = String.join("-", b);

        System.out.println(result);
        System.out.println(Arrays.toString(b));

    }

}

class Accumul {

    public static String accum(String s) {
        String [] b = s.split("");

        for (int i = 0; i < b.length; i++) {
            String str = b[i].toLowerCase(Locale.ROOT);
            for (int j = 0; j < i; j++) {
                b[i] = b[i].concat(str);
            }
        }

        return String.join("-", b);
    }
}
