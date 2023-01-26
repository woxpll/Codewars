package com.company;

import java.util.Arrays;

public class CodeWars43 {
    public static void main(String[] args) {

        String DNA = "TAACG";
//
//        String [] b = DNA.split("");
//
//        for (int i = 0; i < b.length; i++) {
//
//            if(b[i].equals("A")){
//                b[i] = b[i].replace("A", "T");
//
//            }else if(b[i].equals("T")){
//                b[i] = b[i].replace("T", "A");
//
//            }else if(b[i].equals("C")) {
//                b[i] = b[i].replace("C", "G");
//
//            }else if(b[i].equals("G")) {
//                b[i] = b[i].replace("G", "C");
//            }else{
//
//            }
//        }
//
//
//
//        System.out.println(Arrays.toString(b));


        DnaStrand dnaStrand = new DnaStrand();
        System.out.println(dnaStrand.makeComplement(DNA));

    }
}

class DnaStrand {
    public static String makeComplement(String dna) {
        String [] b = dna.split("");

        for (int i = 0; i < b.length; i++) {

            if (b[i].equals("A")) {
                b[i] = b[i].replace("A", "T");

            } else if (b[i].equals("T")) {
                b[i] = b[i].replace("T", "A");

            } else if (b[i].equals("C")) {
                b[i] = b[i].replace("C", "G");

            } else if (b[i].equals("G")) {
                b[i] = b[i].replace("G", "C");
            }
        }

        return String.join("", b);
    }
}
