package com.company;


import java.util.Arrays;

public class CodeWars13 {
    public static void main(String[] args) {

        TestKata testKata = new TestKata();
        System.out.println(testKata.smallEnough(new int[]{66, 123}, 101));
    }
}

class TestKata{

    public static boolean smallEnough(int[] a, int limit){

        int max = Arrays.stream(a).max().getAsInt();
        if (max <= limit){
            return true;
        }else
            return false;


    }
}