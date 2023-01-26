package com.company;

public class CodeWars11 {
    public static void main(String[] args) {

        TestLoh testLoh = new TestLoh();
        Fighter fighter1 = new Fighter("Jerry", 30, 3);
        Fighter fighter2 = new Fighter("Harald", 20, 5);
        System.out.println(TestLoh.declareWinner(fighter1,fighter2,"Jerry"));

    }
}

class TestLoh{
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        int hp1 = fighter1.health;
        int hp2 = fighter2.health;
        int damage1 = fighter1.damagePerAttack;
        int damage2 = fighter2.damagePerAttack;


        if (fighter1.name.equals(firstAttacker)) {
            while (hp1 >= 0 || hp2 >= 0) {
                hp2 = hp2 - damage1;
                if (hp2 <= 0) {
                    System.out.println(hp1 + " " + hp2);
                    break;
                }
                hp1 = hp1 - damage2;
                if (hp1 <= 0) {
                    System.out.println(hp1 + " " + hp2);
                    break;
                }
                System.out.println(hp1 + " " + hp2);
            }
            if (hp2 > 0){
                return fighter2.name;
            }
            else
                return fighter1.name;
        }else if (fighter2.name.equals(firstAttacker)) {
            while (hp1 >= 0 || hp2 >= 0) {
                hp1 = hp1 - damage2;
                if (hp1 <= 0) {
                    System.out.println(hp1 + " " + hp2);
                    break;
                }
                hp2 = hp2 - damage1;
                if (hp2 <= 0) {
                    System.out.println(hp1 + " " + hp2);
                    break;
                }
                System.out.println(hp1 + " " + hp2);
            }
            if (hp1 > 0){
                return fighter1.name;
            }else {
                return fighter2.name;
            }
        }
        else
            return "";
    }
}

class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

