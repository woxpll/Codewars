package com.company;

import java.util.Arrays;

public class CodeWars19 {
    public static void main(String[] args) {
        KataDouble kataDouble = new KataDouble();
        System.out.println(kataDouble.findUniq(new double[]{ 0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0, 0.55, 0, 0}));
    }
}

class KataDouble {
    public static double findUniq(double arr[]) {

        Arrays.sort(arr);
        if(arr[0] == arr[1]){
            return arr[arr.length - 1];
        }
        return arr[0];
    }
}