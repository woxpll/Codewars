package com.company;


//https://www.codewars.com/kata/563b662a59afc2b5120000c6
public class CodeWars50 {

    public static void main(String[] args) {
        Arge arge = new Arge();
        arge.nbYear(1500, 5, 100, 5000);
    }

}

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {

        double p1 = 0;
        int check = 0;

        double newP = percent * 0.01;
        while (p0 < p){
            p1 = (int) (p0 + p0 * newP + aug);
            p0 = (int) p1;
            check++;
        }

        return check;
    }
}