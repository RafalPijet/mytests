package com.mytests;

class Plate {
    Plate(int i) {
        System.out.println("Konstruktor klasy Plate przyjmuje argument --> " + i);
    }
}
class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("Konstruktor klasy DinnerPlate przyjmuje argument --> " + i);
    }
}
class Utensil {
    Utensil(int i) {
        System.out.println("Konstruktor klasy Utensil przyjmuje argument --> " + i);
    }
}
class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Konstruktor klasy Spoon przyjmuje argument --> " + i);
    }
}
class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Konstruktor klasy Fork przyjmuje argument --> " + i);
    }
}
class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Konstruktor klasy Knife przyjmuje argument --> " + i);
    }
}
public class Custom {
    Custom(int i) {
        System.out.println("Konstruktor klasy Custom przyjmuje argument --> " + i);
    }
}
class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("Konstruktor klasy PlaceSetting przyjmuje argument --> " + i);
    }
    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(10);
    }
}
