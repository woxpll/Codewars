package com.company;


//https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad/java

public class CodeWars48 {
    public static void main(String[] args) {

        VolTank volTank = new VolTank();
        volTank.tankVol(5, 7, 3848);
    }
}

class VolTank {
    public static int tankVol(int h, int d, int vt) {

        double rad = d / 2.0;
        double vtH = vt / (Math.PI * rad * rad);
        double angle = (2 * Math.acos(1 - h/rad));
        double square = (rad * rad) / 2 * (angle - Math.sin(angle));
        int total = (int) (square * vtH);
        return total;
    }
}