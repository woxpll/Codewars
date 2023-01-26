package com.company;

//https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java

public class CodeWars49 {

    public static void main(String[] args) {

    }

}


class Positive{

    public static int sum(int[] arr){

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                res += arr[i];
            }
        }
        return res;
    }
}