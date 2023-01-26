package com.company;

public class CodeWars39 {

    public static void main(String[] args) {

        Reflections reflections = new Reflections();

//        int [] p = new int[]{3,5};
//        int [] q = new int[]{1,1};
//
//        int x1 = p[0];
//        int x2 = p[1];

//        System.out.println(x1 + " " + x2);

        reflections.reflectPoint(new int[]{0,0}, new int[]{1,1});

    }

}

class Reflections{

    public static int[] reflectPoint(int[] p, int[] q){

        int x1 = p[0];
        int x2 = p[1];

        int y1 = q[0];
        int y2 = q[1];

        int t1 = y1 - x1;
        int t2 = y2 - x2;

        int z1 = 0 + y1 + t1;
        int z2 = 0 + y2 + t2;

        System.out.println(z1 + " " + z2);

        int [] z = new int[]{z1,z2};
        return z;
    }

}