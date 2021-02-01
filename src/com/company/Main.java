package com.company;

public class Main {

    public static void main(String[] args) {
        creatObject("Tokmok").print();
        creatObject("Toctogul").print();
        creatObject("Kochkor").print();
    }
    public static Printable creatObject(String name){
        Printable temp =null;
        switch (name){
            case "Tokmok":
                temp = new Tokmok("Tokmok",74);
                break;

            case "Toctogul":
                temp = new Toctogul("Toctogul",34654);
                break;

            case "Kochkor":
                temp = new Kochkor("Kochkor",1923);
                break;
            default:
                return temp;
        }
        return temp;
    }
    
}
