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
    Alien3() {
        System.out.println("Jestem konstruktorem Alien3");
    }
}

class Aliens3_1 extends Alien3 {
    Alien1 al1 = new Alien1();
    Alien2 al2 = new Alien2();
    Aliens3_1() {
        System.out.println("Jestem konstruktorem Alien3_1");
    }
}

class Aliens3_2 extends Aliens3_1 {
    Aliens3_2() {
        System.out.println("Jestem konstruktorem Alien3_2");
    }

}

class Aliens_Apli {
    public static void main(String[] args) {
        new Aliens3_2();
    }
        }
