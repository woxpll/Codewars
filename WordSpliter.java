package com.company;

import java.util.ArrayList;
import java.util.List;

public class WordSpliter {
    public static void main(String[] args) {

        String str = "bdfhjlnpseek";

        double a = (double) str.length() / 5;
        double j = Math.ceil(a);

        List<String> ret = new ArrayList<>((int) ((str.length() + j) / j) + 1 );

        for (int start = 0; start < str.length(); start += j) {
            ret.add(str.substring(start, (int) Math.min(str.length(), start + j)));
            if(ret.stream().count() == 4){
                ret.add("");
            }
        }

        System.out.println(ret.stream().count());

        System.out.println(ret);

    }
}
