package com.company;

public class CodeWars37 {

    public static void main(String[] args) {
        String pangram1 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        System.out.println(pc.check(pangram1));
    }
}

class PangramChecker {
    public boolean check(String sentence){

        boolean[] storage = new boolean[26];
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z'){
                index = sentence.charAt(i) - 'A';
            }else if('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z'){
                index = sentence.charAt(i) - 'a';
            }else
                continue;

            storage[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            if(storage[i] == false){
                return false;
            }
        }

        return true;



    }
}