package com.company;

public final class Kochkor extends Bishkek {
    private int date;

    public Kochkor(String name, int date) {
        super(name);
        this.date = date;
    }

    public Kochkor(String name) {
        super(name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("дата города:"+date);
    }
}
