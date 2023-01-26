package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars44 {

    public static void main(String[] args) {

//        int n = 7568;
//
//        String [] test = String.valueOf(n).split("");
//        int [] arr = new int[test.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(test[i]);
//        }
//
//
//
//        System.out.println(Arrays.toString(test));
//        System.out.println(Arrays.toString(arr));

        DigPow digPow = new DigPow();
        System.out.println(digPow.digPow(92, 1));
    }

}

class DigPow {

    public static long digPow(int n, int p) {

        String [] test = String.valueOf(n).split("");
        int [] arr = new int[test.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(test[i]);
        }
        int check = 0;
        int checkRes = 0;
        for (int i = 0; i < arr.length; i++) {
            check = (int) Math.pow(arr[i], p);
            p++;
            checkRes += check;
        }

        if(checkRes % n == 0){
            return checkRes / n;
        }else {
            return -1;
        }

    }

}