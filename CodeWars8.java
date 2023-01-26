package com.company;

public class CodeWars8 {

    public static void main(String[] args) {

        TestCode999 testCode999 = new TestCode999();
        System.out.println(testCode999.countingSheep(10));
    }
}

class TestCode999{

    public static String countingSheep(int num) {

        String str = "";
        for (int i = 1; i <= num; i++) {
            str += i + " sheep...";
        }
        return str;
//        int count = 0;
//
//        do {
//            count++;
//            return count + " sheep...";
//        } while (count < 5);


    }
}
