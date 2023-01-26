package com.company;

import java.util.Arrays;

public class CodeWars30 {
    public static void main(String[] args) {


        Person[] meet = new Person[] {
                new Person("tim", 2),
                new Person("jim", 4),
                new Person("randy", 0),
                new Person("sandy", 5),
                new Person("andy", 8),
                new Person("katie", 6),
                new Person("laura", 2),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 8),
        };

        TheOffice theOffice = new TheOffice();
        System.out.println(theOffice.outed(meet, "john"));




    }




}

class TheOffice {
    public static String outed(Person[] meet, String boss) {

        int count = 0;
        int employer = meet.length;
        int happinessTotal = 0;
        int bossHappy = 0;

        for (int i = 0; i < meet.length; i++) {

            if(meet[i].name == boss){
                break;
            }
            count++;
        }

        for (int i = 0; i < meet.length; i++) {
            if (i == count) {
                bossHappy =  meet[i].happiness;
                break;
            }
        }

        for (int i = 0; i < meet.length; i++) {
            happinessTotal = happinessTotal + meet[i].happiness;
        }

        System.out.println(bossHappy);
        int totalScore = (int) Math.floor((happinessTotal + bossHappy) / employer);
        System.out.println(totalScore);

        if (totalScore <= 5){
            return "Get Out Now!";
        }else {
            return "Nice Work Champ!";
        }

    }
}

class Person{
    final String name;
    final int happiness;

    Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }
}
