package com.company;

public class CodeWars40 {

    public static void main(String[] args) {

        Kata11 kata11 = new Kata11();

    }
}

class Kata11 {
    public static String rps(String p1, String p2) {

        if (p1.equals(p2)){
            return "Draw";
        }else if(p1.equals("rock") && p2.equals("scissors")){
            return "Player 1 won!";
        }else if(p1.equals("scissors") && p2.equals("paper")){
            return "Player 1 won!";
        }else if(p1.equals("paper") && p2.equals("rock")){
            return "Player 1 won!";
        }else {
            return "Player 2 won!";
        }


    }
}
