package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeWars51 {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{-121, 14641, 20736, 361, 25921, 361, 20736, 361};

        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(list + " Проверка");
        System.out.println(Math.sqrt(-14));



        AreSame areSame = new AreSame();
        System.out.println(areSame.comp(a,b));
    }
}

class AreSame {

    public static boolean comp(int[] a, int[] b) {

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
        Collections.sort(aList);
        Collections.sort(bList);

        if(a == null || b == null){
            System.out.println("kek");
        }

        System.out.println(a.length);
        System.out.println(b.length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < aList.size(); i++) {
            if(aList.get(i) < 0){
                aList.set(i,aList.get(i) * -1);
            }
        }

        for (int i = 0; i < bList.size(); i++) {

            if(Math.sqrt(bList.get(i)) % 1 == 0){
                bList.set(i, (int) Math.sqrt(bList.get(i)));
            }
        }

        System.out.println(aList);
        System.out.println(bList);

        return aList.equals(bList);
    }
}
