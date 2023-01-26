package com.company;

import java.util.Arrays;


public class CodeWars10 {
    public static void main(String[] args) {

        NumbersCode numbersCode = new NumbersCode();
        System.out.println(numbersCode.highAndLow("1 2 4 5 10 -3"));

    }
}

class NumbersCode{

    public static String highAndLow(String numbers) {
        int[] numArr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        int high = Arrays.stream(numArr).max().getAsInt();
        int low = Arrays.stream(numArr).min().getAsInt();
        return String.valueOf(high) + " " + String.valueOf(low);
    }
}
