package com.company;

import java.util.Arrays;

public class CodeWars29 {

    public static void main(String[] args) {

        int startPriceOld = 2000;
        int startPriceNew = 8000;
        int savingPerMonth = 1000;
        double percentLossByMonth = 1.5;

        BuyCar buyCar = new BuyCar();
        System.out.println(Arrays.toString(buyCar.nbMonths(startPriceOld, startPriceNew, savingPerMonth, percentLossByMonth)));


    }



}

class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        int months = 0;
        double moneyLeft;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double savings = 0;
        final double LOSS_PERCENT_INCREASE = 0.5;

        while ((priceOld + savings) < priceNew){
            months++;

            if (months % 2 == 0) {
                percentLossByMonth = percentLossByMonth + LOSS_PERCENT_INCREASE;
            }

            priceOld = priceOld - priceOld * (percentLossByMonth / 100);
            priceNew = priceNew - priceNew * (percentLossByMonth / 100);
            savings = savings + savingperMonth;
        }

        moneyLeft = (savings + priceOld) - priceNew;

        return new int[]{months, (int) Math.round(moneyLeft)};
    }
}


