package com.company;

import java.util.ArrayList;

public class Test666 {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("Исходное содежимое: ");
        for (int v: vals) {
            System.out.print(v + " ");
        }

        System.out.println();

        int sum = 0;


        System.out.print("Сумма содержимого: ");
        for (int v : vals) {
            sum += v;
        }
        System.out.print(sum);
    }
}
