package com.company;

public class Test308 {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Текущий испольнитель: " + t);

        t.setName("My Thread");

        System.out.println("Текущий испольнитель после изменения: " + t);

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }

}
