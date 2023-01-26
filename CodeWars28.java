package com.company;

import java.util.Arrays;

public class CodeWars28 {
    public static void main(String[] args) {
        int A = 0, B = 100, K = 2;
        printKPFNums(A, B, K);
    }

    static void printKPFNums(int A, int B, int K)
    {
        // Count prime factors of all numbers
        // till B.
        int p_factors[] = new int[B+1];
        Arrays.fill(p_factors,0);

        for (int p = 2; p <= B; p++)
            if (p_factors[p] == 0)
                for (int i = p; i <= B; i += p)
                    p_factors[i]++;

        // Print all numbers with k prime factors
        for (int i = A; i <= B; i++)
            if (p_factors[i] == K)
                System.out.print( i + " ");
    }
}
