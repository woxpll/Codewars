package com.company;

public class TestMeta_3_7 {

    public static void main(String[] args) {
        Employer sam = new Employer("Sam", "Microsoft");
        sam.display();
//        sam.work();
    }

}

class Person2{
    private String name;

    public String getName() {
        return name;
    }

    public Person2(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + name);
    }

}

class Employer extends Person2{

    private String company;

    public Employer(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("%s works in %s ", getName(), company);
    }

    public void work(){
        System.out.printf("%s works in %s", getName(), company);
    }
}