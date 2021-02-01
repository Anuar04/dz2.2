package com.company;

public class Tokmok  extends Bishkek{
    private  int age;
    public Tokmok(String name,int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("возраст людей :"+age);
    }
}
