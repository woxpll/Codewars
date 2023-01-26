package com.company;

import java.util.ArrayList;

public class Test651 {

    public static void main(String[] args) {

        ArrayList <String> strList = new ArrayList();

        System.out.println("Начальный размер списочного массива str: " + strList.size() );

        strList.add("C");
        strList.add("A");
        strList.add("E");
        strList.add("B");
        strList.add("D");
        strList.add("F");
        strList.add(1,"A2");

        System.out.println("Размер после ввода: " + strList.size());

        System.out.println("Содержимое: " + strList);

        strList.remove("F");
        strList.remove(2);

        System.out.println("Размер после удаление: " + strList.size());

        System.out.println("Содержимое после удаление: "  + strList);
    }

}
