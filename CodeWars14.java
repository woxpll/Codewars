package com.company;

import java.util.Arrays;

public class CodeWars14 {
    public static void main(String[] args) {

        MaxKata maxKata = new MaxKata();
        System.out.println(maxKata.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }
}

class MaxKata{
    public static int sequence(int[] arr) {

        if (arr.length == 0){
            return 0;
        }else if(arr.length > 1){
            int max = Arrays.stream(arr).max().getAsInt();
            if (max <= 0){
                return 0;
            }else {
                int maxSum = 0;
                int thisSum = 0;
                for (int i = 0; i < arr.length; i++) {
                    thisSum += arr[i];
                    if (thisSum > maxSum){
                        maxSum = thisSum;
                    }else if (thisSum < 0){
                        thisSum = 0;
                    }
                }
                return maxSum;
            }
        }else
            return 0;
    }
}