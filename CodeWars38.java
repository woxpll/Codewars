package com.company;

import java.util.Arrays;

public class CodeWars38 {
    public static void main(String[] args) {

        long n = 39;
        Persist persist = new Persist();
        System.out.println(persist.persistence(n));

    }

}

class Persist {
    public static int persistence(long n) {

        int count = 0;
        long result = 1;
        String s = Long.toString(n);
        long[] storage = new long[s.length()];

        for (int i = storage.length - 1; i >= 0; i--) {
            storage[i] = n % 10;
            n /= 10;
        }

        while (Arrays.stream(storage).count() != 1){

            for (int i = 0; i < storage.length; i++) {
                result *= storage[i];
            }

            count++;

            String b = Long.toString(result);
            long[] newStorage = new long[b.length()];
            for (int i = newStorage.length - 1; i >= 0; i--) {
                newStorage[i] = result % 10;
                result /= 10;
            }

            result = 1;
            storage = newStorage;

        }

        return count;
    }
}