package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CodeWars22 {
    public static void main(String[] args) {

        double crat = 2.0d;
        int result1 = 0;
        int resullt2 = 0;

//        if(n <= 2){
//            return null;
//        }



        for (int i = 0; i < 10; i++) {

            double cd = 1 / crat;
            double xdxd = Math.pow(14348944, cd);
            double roundOff = (double) Math.round(xdxd * 100) / 100;
            double floor = Math.floor(roundOff);
            System.out.println(xdxd + " результат");
            System.out.println(Math.ceil(xdxd) + " окргуление");
            System.out.println(roundOff + " jrrh");
            System.out.println(cd + " делитель ");


            if (roundOff == floor){
                result1 = (int) roundOff;
                resullt2 = (int) crat;
                break;
            }else{
                crat++;
            }
        }

        if (crat == 12){
            System.out.println("gdfgdfg");
        }else {
            System.out.println(result1 + " " + resullt2);
        }

    }
}


class PerfectPower {
    public static int[] isPerfectPower(int n) {




        double crat = 2d;
        int result1 = 0;
        int result2 = 0;

        if(n <= 2){
            return null;
        }

        for (int i = 0; i < 10; i++) {

            double cd = 1 / crat;
            double xdxd = Math.pow(n, cd);
            double roundOff = (double) Math.round(xdxd * 100) / 100;
            double floor = Math.floor(roundOff);

            if (roundOff == floor){
                result1 = (int) roundOff;
                result2 = (int) crat;
                break;
            }else{
                crat++;
            }
        }

        if (crat == 12.0){
            return null;
        }else {
            int[] result0 = new int[]{result1, result2};
            return result0;
        }

    }
}