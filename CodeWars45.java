package com.company;

public class CodeWars45 {

    public static void main(String[] args) {

        Sum sum = new Sum();
        System.out.println(sum.GetSum(-1,2));

    }

}


class Sum {
    public int GetSum(int a, int b) {
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        return (max - min + 1) * (max + min) / 2;
    }
}