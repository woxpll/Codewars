package com.company;

public class CodeWars18 {
    public static void main(String[] args) {

        RoundToTheNextMultipleOf5 round = new RoundToTheNextMultipleOf5();
        System.out.println(round.roundToNext5(-1541609));

    }
}

class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {


        if (number < -5){
            return -1 * (int) (5*(Math.ceil(Math.abs(number/5))));
        }else if(number >= -4 & 0 >= number){
            return 0;
        }else {
            return (number + (number < 0 ? 1 - 5 : 5 - 1)) / 5 * 5;
        }

//        if (number >= -4 & 0 >= number){
//            return 0;
//        }else if(number < 5) {
//            return (number + (number < 0 ? 1 - 5 : 5 - 1)) / 5 * 5;
//        }else
//            return (number + (number < 0 ? 5 / -2 : 5 / 2)) / 5 * 5;

    }
}