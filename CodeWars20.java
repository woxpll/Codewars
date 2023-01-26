package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars20 {
    public static void main(String[] args) {

        String u = "I should have known that you would have a perfect answer for me!!!";
        int shift = 1;
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.movingShift(u, shift));
        List<String> ret = new ArrayList<>();
        ret.add("J vltasl rlhr ");
        ret.add("zdfog odxr ypw");
        ret.add(" atasl rlhr p ");
        ret.add("gwkzzyq zntyhv");
        ret.add(" lvz wp!!!");

        
        System.out.println(caesarCipher.demovingShift(ret,1));

    }

}

class CaesarCipher {
    public static List<String> movingShift(String s, int shift) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                str += codeChar(c, shift, 65);
            } else {
                if (c >= 97 && c <= 122) {
                    str += codeChar(c, shift, 97);
                } else {
                    str += c;
                }
            }
            shift++;
            if(shift >= 26){
                shift = 0;
            }
        }

        double a = (double) str.length() / 5;
        double j = Math.ceil(a);

        List<String> ret = new ArrayList<>((int) ((str.length() + j) / j) + 1 );

        for (int start = 0; start < str.length(); start += j) {
            ret.add(str.substring(start, (int) Math.min(str.length(), start + j)));

        }
        if(ret.stream().count() == 4){
            ret.add("");
        }

        return ret;
    }

    private static char codeChar(char c, int key, int shift) {
        int a = (int) c + key;
        if (a >= shift + 26)
            a -= 26;
        return (char) a;
    }

    public static String demovingShift(List<String> s, int shift) {
        String strCode = String.join("", s);
        int key = 26 - shift;

        String strDecode = "";

        for (int i = 0; i < strCode.length(); i++) {
            char c = strCode.charAt(i);
            if (c >= 65 && c <= 90) {
                strDecode += codeChar(c, key, 65);
            } else {
                if (c >= 97 && c <= 122) {
                    strDecode += codeChar(c, key, 97);
                } else {
                    strDecode += c;
                }
            }
            key--;
            if(key == 0){
                key = 26;
            }
        }

        return strDecode;
    }

}