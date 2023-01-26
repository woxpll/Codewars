package com.company;

public class NewCezarCode {

    public static void main(String[] args) {

        String message = "I should have known that you would have a perfect answer for me!!!";

        int key = 1;
        key = Math.abs(key) % 26;

        NewCezarCode cezar = new NewCezarCode();
        String msg1 = cezar.code(message, key);
        System.out.println(message + " -> " + msg1);
        String msg2 = cezar.deCode(msg1, key);
        System.out.println(msg1 + " -> " + msg2);
    }

    public String code(String s, int key) {

        String str = "";

        System.out.println("key = " + key);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 65 && c <= 90) {
                str += codeChar(c, key, 65);
            } else {
                if (c >= 97 && c <= 122) {
                    str += codeChar(c, key, 97);
                } else {
                    str += c;
                }
            }
            key++;
            if(key >= 26){
                key = 0;
            }
        }
        return str;
    }

    private char codeChar(char c, int key, int shift) {
        int a = (int) c + key;

        if (a >= shift + 26)
            a -= 26;
        return (char) a;
    }

    public String deCode(String s, int key) {
        return code(s, 26 - key);
    }

    public static void codeCase() {
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println("---------------");
        System.out.println((int) 'a');
        System.out.println((int) 'z');
        System.out.println("---------------");
    }

}