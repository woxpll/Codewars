package com.company;

public class CodeWars5 {

    public static void main(String[] args) {

        TestCode5 testCode5 = new TestCode5();
        System.out.println(testCode5.checkWord("456456"));

    }
}

class TestCode5{

    public static int checkWord (String s){

        int i = Integer.valueOf(s);
        return i;

    }

}