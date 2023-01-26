package com.company;

public class Test311 {

    public static void main(String[] args) {
        new NewThread();

        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Гланый поток прерван.");
        }
        System.out.println("Гланый поток завершен.");
    }

}


class NewThread implements Runnable{

    Thread t;

    NewThread(){
        t = new Thread(this,"Демострационный поток");
        System.out.println("Дочерный поток создан: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Дочерный поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерный поток завершен.");
    }
}