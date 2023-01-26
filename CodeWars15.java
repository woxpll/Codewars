package com.company;

public class CodeWars15 {
    public static void main(String[] args) {

        AngleSum angleSum = new AngleSum();
        System.out.println(angleSum.sumOfAngles(3));
        System.out.println(angleSum.sumOfAngles(4));
        System.out.println(angleSum.sumOfAngles(5));

    }
}

class AngleSum {
    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }
}
