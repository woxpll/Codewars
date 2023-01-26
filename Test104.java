package com.company;

public class Test104 {

    public static void main(String[] args) {
        int twoDD [][] = new int[4][];
        twoDD[0] = new int[1];
        twoDD[1] = new int[2];
        twoDD[2] = new int[3];
        twoDD[3] = new int[4];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                twoDD [i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(twoDD[i][j] + " ");
            }
            System.out.println();
        }
    }

}
