package com.company;

public class Toctogul extends Bishkek {
    private int peopeles;

    public Toctogul(String name, int peopeles) {
        super(name);
        this.peopeles = peopeles;
    }

    public Toctogul(String name) {
        super(name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("число людей:"+peopeles);
    }
}
