package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test578 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int i;
        int sum = 0;
        System.out.println("Введите число, 0 - для выхода");

        do {

            str = bf.readLine();
            try{
                i = Integer.parseInt(str);
            }catch (NumberFormatException e){
                System.out.println("Неправильный формат");
                i = 0;
            }

            sum += i;
            System.out.println("Текущая сумма " + sum );

        }while (i != 0);
    }

}
