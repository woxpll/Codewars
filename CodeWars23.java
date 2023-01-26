package com.company;

import java.util.HashMap;

public class CodeWars23 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        int cent = 91;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (cent >= 25){
            map.put("Quarters", quarters + 1);
            quarters++;
            cent = cent - 25;
            System.out.println(quarters + " q " + cent);
        }
        while (cent >= 10){
            map.put("Dimes", dimes + 1);
            dimes++;
            cent = cent - 10;
            System.out.println(dimes + " d " + cent);
        }
        while (cent >= 5){
            map.put("Nickels", nickels + 1);
            nickels++;
            cent = cent - 5;
            System.out.println(nickels + " n " + cent);
        }
        while (cent >= 1){
            map.put("Pennies", pennies + 1);
            pennies++;
            cent = cent - 1;
            System.out.println(pennies + " p " + cent);
        }

        System.out.println(map);





//        Change change = new Change();
//        System.out.println(change.looseChange(29));
    }
}

class Change {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        if (cent <= 0){
            return map;
        }

        while (cent >= 25){
            map.put("Quarters", quarters + 1);
            quarters++;
            cent = cent - 25;

        }
        while (cent >= 10){
            map.put("Dimes", dimes + 1);
            dimes++;
            cent = cent - 10;
        }
        while (cent >= 5){
            map.put("Nickels", nickels + 1);
            nickels++;
            cent = cent - 5;
        }
        while (cent >= 1){
            map.put("Pennies", pennies + 1);
            pennies++;
            cent = cent - 1;
        }

        return map;
    }
}