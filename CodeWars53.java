package com.company;

//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodeWars53 {
    public static void main(String[] args) {

        int[] num = new int[]{5, 3, 1, 8, 0};
        Kata53 kata53 = new Kata53();
        kata53.sortArray(num);

    }
}

class Kata53 {
    public static int[] sortArray(int[] array) {

        int zero = -1;

        List<Integer> aList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> cList = Arrays.stream(array).boxed().collect(Collectors.toList());

        if(aList.contains(0)){
            zero = aList.indexOf(0);
            aList.remove(zero);
            bList.remove(zero);
            cList.remove(zero);
        }

        Collections.sort(bList);
        Collections.sort(cList);

        for (int i = 0; i < cList.size() ; i++) {
            for (int j = 0; j < cList.size(); j++) {
                if(cList.get(j) % 2 == 0){
                    cList.remove(j);
                }
            }
        }

        for (int i = 0; i < aList.size(); i++) {
            if(aList.get(i) % 2 == 0){
                cList.add(i, aList.get(i));
            }
        }

        if(zero != -1){
            cList.add(zero, 0);
        }

        return cList.stream().mapToInt(i -> i).toArray();

//        System.out.println(bList + " one");
//
//
//        if(aList.contains(0)){
//            for (int i = 0; i < aList.size(); i++) {
//                if(aList.get(i).equals(0)){
//                    zero = aList.indexOf(0);
//                    aList.remove(i);
//                    bList.remove(i);
//                }
//            }
//        }
//
//
//        Collections.sort(bList);
//        System.out.println(zero);
//
//
//        for (int i = 0; i < aList.size(); i++) {
//            if(aList.get(i) % 2 == 0){
//                System.out.println(bList);
//                bList.remove(aList.get(i));
//                bList.add(i,aList.get(i));
//                System.out.println(bList + " after");
//                System.out.println();
//            }
//        }
//
//        if(zero != -1){
//            bList.add(zero, 0);
//        }
//
//        System.out.println(bList + " last");

    }
}


//          for (int i = 0; i < bList.size(); i++) {
//            if(bList.get(i) % 2 == 0){
//                System.out.println(aList + " " + bList + " before");
//                aList.set(i, bList.get(i));
//                if(aList.get(i).equals(aList.get(i - 1))){
//                    aList.set(i - 1,bList.get(i - 1));
//                }
//                System.out.println(aList + " " + bList + " after");
//                System.out.println();
//            }
//        }