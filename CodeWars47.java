package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java

public class CodeWars47 {
    public static void main(String[] args) {

        String [] test = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        DirReduction dirReduction = new DirReduction();
        System.out.println(dirReduction.dirReduc(test));

    }
}

class DirReduction {
    public static String[] dirReduc(String[] arr) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        int k = 1;

        while (k != 0){
            k = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if(i == arrayList.size() - 1){
                    break;
                }
                if (arrayList.get(i).contains("NORTH")) {
                    if (arrayList.get(i + 1).contains("SOUTH")) {
                        arrayList.remove(i);
                        arrayList.remove(i);
                        k++;
                        System.out.println(arrayList + " 1");
                    }
                } else if (arrayList.get(i).contains("SOUTH")) {
                    if (arrayList.get(i + 1).contains("NORTH")) {
                        arrayList.remove(i);
                        arrayList.remove(i);
                        k++;
                        System.out.println(arrayList + " 2");
                    }
                } else if (arrayList.get(i).contains("WEST")) {
                    if (arrayList.get(i + 1).contains("EAST")) {
                        arrayList.remove(i);
                        arrayList.remove(i);
                        k++;
                        System.out.println(arrayList + " 3");
                    }
                } else if (arrayList.get(i).contains("EAST")) {
                    if (arrayList.get(i + 1).contains("WEST")) {
                        System.out.println(arrayList + " 44 " + i);
                        arrayList.remove(i);
                        arrayList.remove(i);
                        k++;
                        System.out.println(arrayList + " 4");
                    }
                }
            }
        }
        System.out.println(arrayList);
        String[] result = arrayList.toArray(new String[arrayList.size()]);
        return result;
    }
}

//          for (int i = 0; i < arrayList.size(); i++) {
//            for (int j = 1; j < arrayList.size(); j++) {
//                if (arrayList.get(i).contains("NORTH")) {
//                    if (arrayList.get(j).contains("SOUTH")) {
//                        arrayList.remove("NORTH");
//                        arrayList.remove("SOUTH");
//                        k++;
//                        System.out.println("111 " + j + " " + i);
//                    }
//                } else if (arrayList.get(i).contains("SOUTH")) {
//                    if (arrayList.get(j).contains("NORTH")) {
//                        arrayList.remove("NORTH");
//                        arrayList.remove("SOUTH");
//                        k++;
//                        System.out.println("222");
//                    }
//                } else if (arrayList.get(i).contains("WEST")) {
//                    if (arrayList.get(j).contains("EAST")) {
//                        arrayList.remove("WEST");
//                        arrayList.remove("EAST");
//                        k++;
//                        System.out.println("333");
//                    }
//                } else if (arrayList.get(i).contains("EAST")) {
//                    if (arrayList.get(j).contains("WEST")) {
//                        arrayList.remove("WEST");
//                        arrayList.remove("EAST");
//                        k++;
//                        System.out.println("444");
//                    }
//                }
//            }
//        }


//        while (k != 0){
//            k = 0;
//            for (int i = 0; i < arrayList.size(); i++) {
//                for (int j = 1; j < arrayList.size(); j++) {
//                    if (arrayList.get(i).contains("NORTH")){
//                        if(arrayList.get(j).contains("SOUTH")){
//                            arrayList.remove("NORTH");
//                            arrayList.remove("SOUTH");
//                            k++;
//                            System.out.println("111 " + j + " " + i);
//                        }
//                    }else if(arrayList.get(i).contains("SOUTH")){
//                        if(arrayList.get(j).contains("NORTH")){
//                            arrayList.remove("NORTH");
//                            arrayList.remove("SOUTH");
//                            k++;
//                            System.out.println("222");
//                        }
//                    }else if (arrayList.get(i).contains("WEST")){
//                        if(arrayList.get(j).contains("EAST")){
//                            arrayList.remove("WEST");
//                            arrayList.remove("EAST");
//                            k++;
//                            System.out.println("333");
//                        }
//                    }else if(arrayList.get(i).contains("EAST")){
//                        if(arrayList.get(j).contains("WEST")){
//                            arrayList.remove("WEST");
//                            arrayList.remove("EAST");
//                            k++;
//                            System.out.println("444");
//                        }
//                    }
//                }
//            }
//        }