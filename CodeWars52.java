package com.company;

import java.util.Arrays;

//https://www.codewars.com/kata/5526fc09a1bbd946250002dc/java


public class CodeWars52 {
    public static void main(String[] args) {
        int [] nums = {2, 6, 8, 200, 700, 1, 84, 10, 4};
        FindOutlier findOutlier = new FindOutlier();
        System.out.println(findOutlier.find(nums));

    }
}

class FindOutlier{
    public static int find(int[] integers){

        int odd = 0;
        int even = 0;
        int res = 0;

        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        if(odd > even){
            for (int i = 0; i < integers.length; i++) {
                if(integers[i] % 2 == 0){
                   res = integers[i];
                }
            }
        }else {
            for (int i = 0; i < integers.length; i++) {
                if(integers[i] % 2 == 0){
                }else {
                    res = integers[i];
                }
            }
        }
        return res;
    }
}