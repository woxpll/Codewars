package com.company;

public class TestMeta_3_3 {

    public static void main(String[] args) {

        Person1.displayCounter();

        Person1 tom = new Person1();
        Person1 bob = new Person1();

        Person1.displayCounter();
    }


}

class Person1{
    private int id;
    private static int counter = 1;

    Person1(){
        id = counter++;
    }

    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);

    }

    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }

}