package com.company;

import java.util.ArrayList;
import java.util.Spliterator;

public class Test669 {
    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("Содержание массива vals: \n");

        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        spliterator = vals.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrt.add(Math.sqrt(n))));
        System.out.print("Содержимое массива sqrt: \n");
        spliterator = sqrt.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));

    }
}
