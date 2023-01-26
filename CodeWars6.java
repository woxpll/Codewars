package com.company;

public class CodeWars6 {

    public static void main(String[] args) {

    }
}

class TestCode4{

    public static String[] checkWord(String s){

        String [] result = s.split("\\s+");
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i].replaceAll("[^\\w]", "");

        }
        return result;
    }

}