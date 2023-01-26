package com.company;

public class CodeWars32 {

    public static void main(String[] args) {

        Decomp decomp = new Decomp();
        System.out.println(decomp.decompose("9", "10"));

    }

}

class Decomp {

    public static String decompose(String nrStr, String drStr) {

        long nr = Long.parseLong(nrStr);
        long dr = Long.parseLong(drStr);

        if(nr == 0 || dr == 0){
            return "[]";
        }
        String res = "[";
        while (nr != 0 && dr != 0){
            if(nr >= dr){
                res += Long.toString(nr / dr);
                nr -= (nr / dr ) * dr;
            }else {
                res += "1/";
                long tep;
                if(dr % nr == 0){
                    tep = dr / nr;
                }else {
                    tep = dr / nr + 1;
                }
                res += Long.toString(tep);
                nr = nr * tep - dr;
                dr = dr * tep;
            }

            res += ", ";
        }
        res = res.substring(0,res.length() - 2) + "]";

        return res;
    }
}