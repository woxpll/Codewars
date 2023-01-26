package com.company;

import java.util.Arrays;

public class CodeWars17 {
    public static void main(String[] args) {

        SquareDigit squareDigit = new SquareDigit();
        System.out.println(squareDigit.squareDigits(9119));
    }
}

class SquareDigit {

    public int squareDigits(int n) {

        int[] storage = Integer.toString(n).chars().map(c -> c-'0').toArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < storage.length; i++) {
            storage[i] = storage[i] * storage[i];
        }
        for(int i : storage){
            s.append(i);
        }
        return Integer.parseInt(s.toString());
    }
}