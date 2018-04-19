package com.mytests;

public class Constructor {
    int i = 15;
    String text = "domyślny";
    public Constructor(int i, String text) {
        this.i = i;
        this.text = text;
        System.out.println("Jestem konstruktorem z argumentami przekazanymi podczas tworzenia obiektu --> i = " + i + " oraz text = " + text);
    }
    public Constructor() {
        this(30, "argument dzięki słowu kluczowemu this");
        System.out.println("Jestem konstruktorem domyślnym podczas tworzenia obiektu --> i = " + i + " oraz text = " + text);
    }
    public Constructor(int i) {
        this.i = i;
        System.out.println("Jestem konstruktorem z argumentami przekazanymi podczas tworzenia obiektu --> i = " + i + " oraz text = " + text);
    }
    public Constructor(String text) {
        this.text = text;
        System.out.println("Jestem konstruktorem z argumentami przekazanymi podczas tworzenia obiektu --> i = " + i + " oraz text = " + text);
    }

    public static void main(String[] args) {
        new Constructor(20, "podany argument");
        new Constructor();
        new Constructor(50);
        new Constructor("jestem argumentem typu String");
    }
}
