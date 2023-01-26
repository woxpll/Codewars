package com.company;

import java.util.BitSet;

public class CodeWars36 {

    public static void main(String[] args) {
        int n = 42;

        MySolution mySolution = new MySolution();
        System.out.println(mySolution.computeDepth(n));
    }
}

class MySolution {

    private static final int BASE = 10;

    public int computeDepth(int n) {

        int i = 1;

        for (BitSet digits = new BitSet(BASE); digits.cardinality() < BASE; i++) {
            for (int j = i * n; j > 0; j /= BASE) {
                digits.set(j % BASE);
            }
        }

        return i - 1;
    }

}
