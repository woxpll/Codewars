package com.company;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}

abstract class A{
    abstract void callMe();

    void callMeToo(){
        System.out.println("Это конктретный метод");
    }
}

class B extends A{

    @Override
    void callMe() {
        System.out.println("Реализация метода из класса А в методе В");
    }
}