package com.company;

public class Test73 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1000; i > 0; i = i - 7) {

            System.out.println(i + "-7");
            Thread.sleep(20);

        }

    }

}
