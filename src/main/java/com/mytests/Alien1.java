package com.mytests;

public class Alien1 {
    Alien1() {
        System.out.println("Jestem konstruktorem Alien1");
    }
}

class Alien2 {
    Alien2() {
        System.out.println("Jestem konstruktorem Alien2");
    }
}

class Alien3 {
    private Alien1 al1 = new Alien1();
    private Alien2 al2 = new Alien2();
    Alien3() {
        System.out.println("Jestem konstruktorem Alien3");
    }
    Alien1 getAl1() {
        System.out.println("getter z klasy Alien3 zwraca referencje al1 do obiektu klasy Alien1");
        return al1;
    }
    Alien2 getAl2() {
        System.out.println("getter z klasy Alien3 zwraca referencje al2 do obiektu klasy Alien2");
        return al2;
    }
    void show() {
        System.out.println("jestem wywołaniem metody show() klasy Alien3");
    }
}

class Alien3_1 extends Alien3 {
    private Alien1 al1 = new Alien1();
    private Alien2 al2 = new Alien2();
    Alien3_1() {
        System.out.println("Jestem konstruktorem Alien3_1");
    }
    @Override
    Alien1 getAl1() {
        System.out.println("getter z klasy Alien3_1 zwraca referencje al1 do obiektu klasy Alien1");
        return al1;
    }
    @Override
    Alien2 getAl2() {
        System.out.println("getter z klasy Alien3_1 zwraca referencje al1 do obiektu klasy Alien2");
        return al2;
    }
    void show(String text) {
        System.out.println("jestem wywołaniem metody show() klasy Alien3_1 --> " + text);
    }
}

class Alien3_2 extends Alien3_1 {
    Alien1 al1 = new Alien1();
    Alien2 al2 = new Alien2();
    Alien3_2() {
        System.out.println("Jestem konstruktorem Alien3_2");
    }

}

class Aliens_Apli {
    public static void main(String[] args) {
        Alien3 alien = new Alien3_2();
        alien.getAl1();
        alien.getAl2();
        alien.show();
        Alien3_1 alien1 = new Alien3_1();
        alien1.show("jestem przeciążoną metodą!!!");
        alien1.show();

    }
        }
