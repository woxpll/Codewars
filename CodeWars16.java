package com.company;

public class CodeWars16 {
    public static void main(String[] args) {

        KataExample kataExample = new KataExample();
        System.out.println(kataExample.solution("abc", "bc"));

    }
}

class KataExample {
    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending)){
            return true;
        }else
            return false;
    }
}
